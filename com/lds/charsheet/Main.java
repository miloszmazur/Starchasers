package com.lds.charsheet;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

import net.miginfocom.swing.MigLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Main extends JFrame {
	private JMenu mnNew;
	private JMenuItem mntmNewChamp;
	private JMenuItem mntmViewChamps;
	private JPanel panelList;
	private JPanel panelForm;
	private JList currentHeroes;
	private Vector<Race> races;
	private Vector<Hero> heroes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Main frame = new Main();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * TODO: dodaj listenery do listy, zeby sprawdzic, jak sie zachowuje wyswietlanie i uaktualnianie labeli.
		 * Potem tworzenie i zapisywanie - buttony, nowy jframe, takie tam.
		 */

	}

	public Main() {
		initShit();
		setTitle("Starchasers Char Sheet Designer v0.0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

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

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 33, 14);
		panelForm.add(lblName);

		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(10, 27, 33, 14);
		panelForm.add(lblLevel);

		JLabel lblRace = new JLabel("Race");
		lblRace.setBounds(10, 46, 33, 14);
		panelForm.add(lblRace);

		JLabel varName = new JLabel("");
		varName.setBounds(53, 11, 46, 14);
		panelForm.add(varName);

		JLabel varLvl = new JLabel("");
		varLvl.setBounds(53, 27, 46, 14);
		panelForm.add(varLvl);

		JLabel varRace = new JLabel("");
		varRace.setBounds(53, 46, 46, 14);
		panelForm.add(varRace);

		//testy testy
		currentHeroes = new JList(races);
		DefaultListModel<String> listmodel = new DefaultListModel<>();

		panelList = new JPanel();
		getContentPane().add(panelList, "cell 4 0,grow");
		panelList.setLayout(new GridLayout(0, 1, 0, 0));
		currentHeroes = new JList<String>(listmodel);
		currentHeroes
				.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		currentHeroes.setLayoutOrientation(JList.VERTICAL);
		currentHeroes.setVisibleRowCount(5);

		panelList.add(currentHeroes);
	}

	public void initShit() {
		races = new Vector<Race>();
		loadRaces();
		heroes = new Vector<Hero>();
		loadHeroes();
	}

	private void loadRaces() {
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
			System.out.println(e.getClass() + " has happened while loading races");
		}

	}

	private Race findRace(String rasa) {
		for (int i = 0; i < races.size(); i++) {
			if (rasa == races.get(i).name)
				return races.get(i);
		}
		return null;
	}

	private void loadHeroes() {
		// tymczasowo z pliku
		try {
			File file = new File(
					"D:\\Dropbox\\Projekty\\Starchasers\\heroes.txt");
			Scanner scan = new Scanner(file);

			while (scan.next() != null) {
				// placz i zawodzenie kobiet - zmienic na uzycie object
				// input/output stream. W najblizszej przyszlosci.
				heroes.add(new Hero(scan.next(), scan.next(), findRace(scan
						.next()), scan.next(), scan.nextInt(), scan
						.nextDouble(), scan.nextDouble(), scan.next(), scan
						.next(), scan.next(), scan.nextInt(), scan.next(), scan
						.nextInt(), scan.nextInt(), scan.nextInt(), scan
						.nextInt(), scan.nextInt(),
						new Attribute(scan.nextDouble(), scan.nextDouble(),
								scan.nextDouble(), scan.nextDouble(), scan
										.nextDouble(), scan.nextDouble())));
			}
			scan.close();

		} catch (Exception e) {
			System.out.println(e.getClass() + " has happened while loading heroes");
		}
	}

}
