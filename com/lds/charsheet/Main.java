package com.lds.charsheet;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

import net.miginfocom.swing.MigLayout;
import javax.swing.JList;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Main extends JFrame {
	private JMenu mnNew;
	private JMenuItem mntmNewChamp;
	private JMenuItem mntmViewChamps;
	private JPanel panelList;
	private JPanel panelForm;
	private JList currentHeroes;
	private LinkedList<Race> races;
	private LinkedList<Hero> heroes;

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

	}

	public Main() 
	{
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
				new MigLayout("", "[grow][grow][][][grow]", "[grow]"));

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

		panelList = new JPanel();
		getContentPane().add(panelList, "cell 4 0,grow");

		currentHeroes = new JList();
		currentHeroes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		currentHeroes.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		currentHeroes.setVisibleRowCount(-1);
		panelList.add(currentHeroes);

	}

	private void loadRaces() 
	{
		try {
			File file = new File(
					"D:\\Dropbox\\Projekty\\Starchasers\\races.txt");
			Scanner scan = new Scanner(file);

			while (scan.next() != null) 
			{
				races.add(new Race(scan.next(), scan.nextDouble()));
			}
			scan.close();

		} catch (Exception e) {System.out.println(e.getClass() + " has happened");}

	}

	public void initShit() {
		races = new LinkedList<Race>();
		loadRaces();
		heroes = new LinkedList<Hero>();
		loadHeroes();
	}

	private void loadHeroes() 
	{
		//woop nothing happens here
	}

}
