package com.lds.charsheet;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

import net.miginfocom.swing.MigLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.awt.GridLayout;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;

@SuppressWarnings("serial")
public class Main extends JFrame {
	private JMenu mnNew;
	private JMenuItem mntmNewChamp;
	private JMenuItem mntmViewChamps;
	private JPanel panelList;
	private JPanel panelForm;
	public JLabel varName;
	public JLabel varLvl;
	public JLabel varRace;
	@SuppressWarnings("rawtypes")
	private JList currentHeroes;
	public static Vector<Race> races;
	public static Vector<Hero> heroes;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		races = new Vector<Race>();
		loadRaces();
		heroes = new Vector<Hero>();
		
		XStream x = new XStream(new StaxDriver());
		Hero her = new Hero("Ziemowit", "Szczecinski", "Terran", "m", 13, 180,
				80, "Zielony", "Czerwony", "Noidea", 0, "Captn", 0, 1, 100, 0,
				0);
		String xml = x.toXML(her);
		System.out.println(xml);
		BufferedWriter out = new BufferedWriter(new FileWriter("D://heroes.xml"));
		out.write(xml);
		out.close();
		//loadHeroes();
		//System.out.println(heroes.get(0));

		try {
			Main frame = new Main();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO:
		// GUI ;-;
		// tworzenie i zapisywanie - buttony, nowy jframe, takie tam.

	}

	@SuppressWarnings("unchecked")
	public Main() {
		setTitle("Starchasers Char Sheet Designer v0.0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		// MENU
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnNew = new JMenu("Action");
		menuBar.add(mnNew);

		mntmNewChamp = new JMenuItem("New Champ");
		mnNew.add(mntmNewChamp);

		mntmViewChamps = new JMenuItem("View Champs");
		mnNew.add(mntmViewChamps);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mnEdit.add(mntmPreferences);
		getContentPane().setLayout(
				new MigLayout("", "[grow][grow][][][grow]", "[grow][]"));

		panelForm = new JPanel();
		getContentPane().add(panelForm, "cell 0 0 4 1,grow");
		panelForm.setLayout(null);

		// LABELE
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 33, 14);
		panelForm.add(lblName);

		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(10, 27, 33, 14);
		panelForm.add(lblLevel);

		JLabel lblRace = new JLabel("Race");
		lblRace.setBounds(10, 46, 33, 14);
		panelForm.add(lblRace);

		// WARTOSCI
		JLabel varName = new JLabel("");
		varName.setBounds(53, 11, 46, 14);
		panelForm.add(varName);

		JLabel varLvl = new JLabel("");
		varLvl.setBounds(53, 27, 46, 14);
		panelForm.add(varLvl);

		final JLabel varRace = new JLabel("");
		varRace.setBounds(53, 46, 46, 14);
		panelForm.add(varRace);

		//LIST
		currentHeroes = new JList<Object>(heroes);

		panelList = new JPanel();
		getContentPane().add(panelList, "cell 4 0,grow");
		panelList.setLayout(new GridLayout(0, 1, 0, 0));

		currentHeroes
				.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		currentHeroes.setLayoutOrientation(JList.VERTICAL);
		currentHeroes.setVisibleRowCount(5);
		currentHeroes.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				int i = currentHeroes.getSelectedIndex();
				varRace.setText(heroes.get(i).toString());

			}
		});

		panelList.add(currentHeroes);
	}

	private static void loadRaces() {
		// tymczasowo z pliku
		try {
			File file = new File(
					"D:\\Dropbox\\Projekty\\Starchasers\\races.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNext()) {
				races.add(new Race(scan.next(), scan.nextInt()));
			}
			scan.close();

		} catch (Exception e) {
			System.out.println(e.getClass()
					+ " has happened while loading races");
		}

	}

	private Race findRace(String rasa) {
		for (int i = 0; i < races.size(); i++) {
			if (rasa == races.get(i).name)
				return races.get(i);
		}
		return null;
	}

	private static void loadHeroes() {
		// tymczasowo z pliku
		XMLDecoder x;
		try {
			x = new XMLDecoder(new BufferedInputStream(new FileInputStream(
					"heroes.xml")));
			Hero herr = (Hero) x.readObject();
			System.out.println(herr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
