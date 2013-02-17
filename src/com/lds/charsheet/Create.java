package com.lds.charsheet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.SliderUI;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.UIManager;
import javax.swing.SpinnerNumberModel;

public class Create extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField imie;
	private JTextField nazwisko;
	private JTextField plec;
	private JTextField kO;
	private JTextField kW;
	private JTextField zawod;
	private JTextField rep;
	private JTextField stanowisko;
	private Vector<Race> races;
	@SuppressWarnings("rawtypes")
	private JComboBox rasa;
	private JLabel labelSilaPsi;
	private JLabel labelPsionika;
	private JSpinner wiek; 
	private JSpinner wzrost;
	private JSpinner waga;
	private JEditorPane znakiSzczegolne;
	
	private JSpinner slawa;
	private JSpinner staz;
	private JSpinner poziom;
	private JSpinner punktyStazu;
	private JSpinner doswiadczenie;

	private JSpinner inteligencja;
	private JSpinner sila;
	private JSpinner zrecznosc;
	private JSpinner wytrzymalosc;
	private JSpinner charyzma;
	private JSpinner psionika;
	

	
	public Create() 
	{
		setTitle("Starchasers lol");
		//DefaultCloseOperation - dispose on close bedzie wlasciwe? research.
		//TAK
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 439, 665);
		setResizable(false);
		getContentPane().setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][grow]"));
		
		races = new Vector<Race>();
		loadRaces();

		JPanel podstawy = new JPanel();
		podstawy.setBorder(new TitledBorder(null, "Podstawowe Informacje", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(podstawy, "cell 0 0,grow");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		podstawy.setLayout(gbl_panel);
		
		JLabel lblImi = new JLabel("Imi\u0119: ");
		GridBagConstraints gbc_lblImi = new GridBagConstraints();
		gbc_lblImi.insets = new Insets(0, 0, 5, 5);
		gbc_lblImi.gridx = 0;
		gbc_lblImi.gridy = 0;
		podstawy.add(lblImi, gbc_lblImi);
		
		imie = new JTextField();
		GridBagConstraints gbc_imie = new GridBagConstraints();
		gbc_imie.gridwidth = 2;
		gbc_imie.fill = GridBagConstraints.HORIZONTAL;
		gbc_imie.insets = new Insets(0, 0, 5, 5);
		gbc_imie.gridx = 1;
		gbc_imie.gridy = 0;
		podstawy.add(imie, gbc_imie);
		imie.setColumns(10);
		
		JLabel lblWzrost = new JLabel("Wzrost: ");
		GridBagConstraints gbc_lblWzrost = new GridBagConstraints();
		gbc_lblWzrost.anchor = GridBagConstraints.EAST;
		gbc_lblWzrost.insets = new Insets(0, 0, 5, 5);
		gbc_lblWzrost.gridx = 3;
		gbc_lblWzrost.gridy = 0;
		podstawy.add(lblWzrost, gbc_lblWzrost);
		
		wzrost = new JSpinner();
		GridBagConstraints gbc_wzrost = new GridBagConstraints();
		gbc_wzrost.fill = GridBagConstraints.HORIZONTAL;
		gbc_wzrost.insets = new Insets(0, 0, 5, 5);
		gbc_wzrost.gridx = 4;
		gbc_wzrost.gridy = 0;
		podstawy.add(wzrost, gbc_wzrost);
		
		JLabel lblNazwisko = new JLabel("Nazwisko: ");
		GridBagConstraints gbc_lblNazwisko = new GridBagConstraints();
		gbc_lblNazwisko.insets = new Insets(0, 0, 5, 5);
		gbc_lblNazwisko.gridx = 0;
		gbc_lblNazwisko.gridy = 1;
		podstawy.add(lblNazwisko, gbc_lblNazwisko);
		
		nazwisko = new JTextField();
		GridBagConstraints gbc_nazwisko = new GridBagConstraints();
		gbc_nazwisko.gridwidth = 2;
		gbc_nazwisko.fill = GridBagConstraints.BOTH;
		gbc_nazwisko.insets = new Insets(0, 0, 5, 5);
		gbc_nazwisko.gridx = 1;
		gbc_nazwisko.gridy = 1;
		podstawy.add(nazwisko, gbc_nazwisko);
		nazwisko.setColumns(10);
		
		JLabel lblWaga = new JLabel("Waga: ");
		GridBagConstraints gbc_lblWaga = new GridBagConstraints();
		gbc_lblWaga.anchor = GridBagConstraints.EAST;
		gbc_lblWaga.insets = new Insets(0, 0, 5, 5);
		gbc_lblWaga.gridx = 3;
		gbc_lblWaga.gridy = 1;
		podstawy.add(lblWaga, gbc_lblWaga);
		
		waga = new JSpinner();
		GridBagConstraints gbc_waga = new GridBagConstraints();
		gbc_waga.fill = GridBagConstraints.HORIZONTAL;
		gbc_waga.insets = new Insets(0, 0, 5, 5);
		gbc_waga.gridx = 4;
		gbc_waga.gridy = 1;
		podstawy.add(waga, gbc_waga);
		
		JLabel lblRasa = new JLabel("Rasa: ");
		GridBagConstraints gbc_lblRasa = new GridBagConstraints();
		gbc_lblRasa.insets = new Insets(0, 0, 5, 5);
		gbc_lblRasa.gridx = 0;
		gbc_lblRasa.gridy = 2;
		podstawy.add(lblRasa, gbc_lblRasa);
		
		rasa = new JComboBox();
		for(Race race: races)
			rasa.addItem(race);
		rasa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int potent = (int)((Race)rasa.getSelectedItem()).psiPotent;
				labelSilaPsi.setText(potent+"%");
				int rand = (int)(Math.random()*100+1);
				if(rand<=potent)
				{
					labelPsionika.setText("Tak");
					psionika.setEnabled(true);
				}
				else
				{
					labelPsionika.setText("Nie");
					psionika.setEnabled(false);
				}
				

			}
		});
		GridBagConstraints gbc_rasa = new GridBagConstraints();
		gbc_rasa.gridwidth = 2;
		gbc_rasa.fill = GridBagConstraints.HORIZONTAL;
		gbc_rasa.insets = new Insets(0, 0, 5, 5);
		gbc_rasa.gridx = 1;
		gbc_rasa.gridy = 2;
		podstawy.add(rasa, gbc_rasa);
		
		JLabel lblKolorOczu = new JLabel("Kolor oczu");
		GridBagConstraints gbc_lblKolorOczu = new GridBagConstraints();
		gbc_lblKolorOczu.anchor = GridBagConstraints.EAST;
		gbc_lblKolorOczu.insets = new Insets(0, 0, 5, 5);
		gbc_lblKolorOczu.gridx = 3;
		gbc_lblKolorOczu.gridy = 2;
		podstawy.add(lblKolorOczu, gbc_lblKolorOczu);
		
		kO = new JTextField();
		GridBagConstraints gbc_kO = new GridBagConstraints();
		gbc_kO.insets = new Insets(0, 0, 5, 5);
		gbc_kO.fill = GridBagConstraints.HORIZONTAL;
		gbc_kO.gridx = 4;
		gbc_kO.gridy = 2;
		podstawy.add(kO, gbc_kO);
		kO.setColumns(10);
		
		JLabel lblPlec = new JLabel("P\u0142e\u0107: ");
		GridBagConstraints gbc_lblPe = new GridBagConstraints();
		gbc_lblPe.insets = new Insets(0, 0, 5, 5);
		gbc_lblPe.gridx = 0;
		gbc_lblPe.gridy = 3;
		podstawy.add(lblPlec, gbc_lblPe);
		
		plec = new JTextField();
		GridBagConstraints gbc_plec = new GridBagConstraints();
		gbc_plec.fill = GridBagConstraints.BOTH;
		gbc_plec.insets = new Insets(0, 0, 5, 5);
		gbc_plec.gridx = 1;
		gbc_plec.gridy = 3;
		podstawy.add(plec, gbc_plec);
		plec.setColumns(10);
		
		JLabel lblKolorWosw = new JLabel("Kolor w\u0142os\u00F3w");
		GridBagConstraints gbc_lblKolorWosw = new GridBagConstraints();
		gbc_lblKolorWosw.anchor = GridBagConstraints.EAST;
		gbc_lblKolorWosw.insets = new Insets(0, 0, 5, 5);
		gbc_lblKolorWosw.gridx = 3;
		gbc_lblKolorWosw.gridy = 3;
		podstawy.add(lblKolorWosw, gbc_lblKolorWosw);
		
		kW = new JTextField();
		GridBagConstraints gbc_kW = new GridBagConstraints();
		gbc_kW.insets = new Insets(0, 0, 5, 5);
		gbc_kW.fill = GridBagConstraints.HORIZONTAL;
		gbc_kW.gridx = 4;
		gbc_kW.gridy = 3;
		podstawy.add(kW, gbc_kW);
		kW.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Wiek:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		podstawy.add(lblNewLabel, gbc_lblNewLabel);
		
		wiek = new JSpinner();
		GridBagConstraints gbc_wiek = new GridBagConstraints();
		gbc_wiek.fill = GridBagConstraints.HORIZONTAL;
		gbc_wiek.insets = new Insets(0, 0, 5, 5);
		gbc_wiek.gridx = 1;
		gbc_wiek.gridy = 4;
		podstawy.add(wiek, gbc_wiek);
		
		JLabel lblZnakiSzczeglne = new JLabel("Znaki szczeg\u00F3lne: ");
		GridBagConstraints gbc_lblZnakiSzczeglne = new GridBagConstraints();
		gbc_lblZnakiSzczeglne.anchor = GridBagConstraints.EAST;
		gbc_lblZnakiSzczeglne.insets = new Insets(0, 0, 5, 5);
		gbc_lblZnakiSzczeglne.gridx = 3;
		gbc_lblZnakiSzczeglne.gridy = 4;
		podstawy.add(lblZnakiSzczeglne, gbc_lblZnakiSzczeglne);
		
		znakiSzczegolne = new JEditorPane();
		GridBagConstraints gbc_znakiSzczegolne = new GridBagConstraints();
		gbc_znakiSzczegolne.insets = new Insets(0, 0, 0, 5);
		gbc_znakiSzczegolne.gridheight = 2;
		gbc_znakiSzczegolne.fill = GridBagConstraints.BOTH;
		gbc_znakiSzczegolne.gridx = 4;
		gbc_znakiSzczegolne.gridy = 4;
		podstawy.add(znakiSzczegolne, gbc_znakiSzczegolne);
		
		JPanel klasa_pd = new JPanel();
		klasa_pd.setBorder(new TitledBorder(null, "Klasa i Do\u015Bwiadczenie", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(klasa_pd, "cell 0 1,grow");
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {0, 0, 0, 0, 30, 30};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		klasa_pd.setLayout(gbl_panel_1);
		
		JLabel lblZawd = new JLabel("Zaw\u00F3d: ");
		GridBagConstraints gbc_lblZawd = new GridBagConstraints();
		gbc_lblZawd.insets = new Insets(0, 0, 5, 5);
		gbc_lblZawd.gridx = 0;
		gbc_lblZawd.gridy = 0;
		klasa_pd.add(lblZawd, gbc_lblZawd);
		
		zawod = new JTextField();
		GridBagConstraints gbc_zawod = new GridBagConstraints();
		gbc_zawod.anchor = GridBagConstraints.WEST;
		gbc_zawod.insets = new Insets(0, 0, 5, 5);
		gbc_zawod.gridx = 1;
		gbc_zawod.gridy = 0;
		klasa_pd.add(zawod, gbc_zawod);
		zawod.setColumns(10);
		
		JLabel lblReputacjaranga = new JLabel("Reputacja/Ranga: ");
		GridBagConstraints gbc_lblReputacjaranga = new GridBagConstraints();
		gbc_lblReputacjaranga.anchor = GridBagConstraints.EAST;
		gbc_lblReputacjaranga.insets = new Insets(0, 0, 5, 5);
		gbc_lblReputacjaranga.gridx = 0;
		gbc_lblReputacjaranga.gridy = 1;
		klasa_pd.add(lblReputacjaranga, gbc_lblReputacjaranga);
		
		rep = new JTextField();
		GridBagConstraints gbc_rep = new GridBagConstraints();
		gbc_rep.anchor = GridBagConstraints.WEST;
		gbc_rep.insets = new Insets(0, 0, 5, 5);
		gbc_rep.gridx = 1;
		gbc_rep.gridy = 1;
		klasa_pd.add(rep, gbc_rep);
		rep.setColumns(10);
		
		JLabel lblStanowisko = new JLabel("Stanowisko");
		GridBagConstraints gbc_lblStanowisko = new GridBagConstraints();
		gbc_lblStanowisko.insets = new Insets(0, 0, 5, 5);
		gbc_lblStanowisko.gridx = 0;
		gbc_lblStanowisko.gridy = 2;
		klasa_pd.add(lblStanowisko, gbc_lblStanowisko);
		
		stanowisko = new JTextField();
		GridBagConstraints gbc_stanowisko = new GridBagConstraints();
		gbc_stanowisko.anchor = GridBagConstraints.WEST;
		gbc_stanowisko.insets = new Insets(0, 0, 5, 5);
		gbc_stanowisko.gridx = 1;
		gbc_stanowisko.gridy = 2;
		klasa_pd.add(stanowisko, gbc_stanowisko);
		stanowisko.setColumns(10);
		
		JLabel lblPs = new JLabel("PS: ");
		GridBagConstraints gbc_lblPs = new GridBagConstraints();
		gbc_lblPs.insets = new Insets(0, 0, 5, 5);
		gbc_lblPs.gridx = 2;
		gbc_lblPs.gridy = 2;
		klasa_pd.add(lblPs, gbc_lblPs);
		
		punktyStazu = new JSpinner();
		GridBagConstraints gbc_punktyStazu = new GridBagConstraints();
		gbc_punktyStazu.insets = new Insets(0, 0, 5, 5);
		gbc_punktyStazu.gridx = 3;
		gbc_punktyStazu.gridy = 2;
		klasa_pd.add(punktyStazu, gbc_punktyStazu);
		
		JLabel lblSawa = new JLabel("S\u0142awa: ");
		GridBagConstraints gbc_lblSawa = new GridBagConstraints();
		gbc_lblSawa.insets = new Insets(0, 0, 5, 5);
		gbc_lblSawa.gridx = 0;
		gbc_lblSawa.gridy = 3;
		klasa_pd.add(lblSawa, gbc_lblSawa);
		
		slawa = new JSpinner();
		GridBagConstraints gbc_slawa = new GridBagConstraints();
		gbc_slawa.insets = new Insets(0, 0, 5, 5);
		gbc_slawa.anchor = GridBagConstraints.WEST;
		gbc_slawa.gridx = 1;
		gbc_slawa.gridy = 3;
		klasa_pd.add(slawa, gbc_slawa);
		
		JLabel lblStaz = new JLabel("Sta\u017C: ");
		GridBagConstraints gbc_lblSta = new GridBagConstraints();
		gbc_lblSta.insets = new Insets(0, 0, 5, 5);
		gbc_lblSta.gridx = 2;
		gbc_lblSta.gridy = 3;
		klasa_pd.add(lblStaz, gbc_lblSta);
		
		staz = new JSpinner();
		GridBagConstraints gbc_staz = new GridBagConstraints();
		gbc_staz.insets = new Insets(0, 0, 5, 5);
		gbc_staz.gridx = 3;
		gbc_staz.gridy = 3;
		klasa_pd.add(staz, gbc_staz);
		
		JLabel lblPoziom = new JLabel("Poziom");
		GridBagConstraints gbc_lblPoziom = new GridBagConstraints();
		gbc_lblPoziom.insets = new Insets(0, 0, 5, 5);
		gbc_lblPoziom.gridx = 0;
		gbc_lblPoziom.gridy = 4;
		klasa_pd.add(lblPoziom, gbc_lblPoziom);
		
		poziom = new JSpinner();
		GridBagConstraints gbc_poziom = new GridBagConstraints();
		gbc_poziom.anchor = GridBagConstraints.WEST;
		gbc_poziom.fill = GridBagConstraints.VERTICAL;
		gbc_poziom.insets = new Insets(0, 0, 5, 5);
		gbc_poziom.gridx = 1;
		gbc_poziom.gridy = 4;
		klasa_pd.add(poziom, gbc_poziom);
		
		JLabel lblPd = new JLabel("PD: ");
		GridBagConstraints gbc_lblPd = new GridBagConstraints();
		gbc_lblPd.insets = new Insets(0, 0, 0, 5);
		gbc_lblPd.gridx = 0;
		gbc_lblPd.gridy = 5;
		klasa_pd.add(lblPd, gbc_lblPd);
		
		doswiadczenie = new JSpinner();
		GridBagConstraints gbc_doswiadczenie = new GridBagConstraints();
		gbc_doswiadczenie.insets = new Insets(0, 0, 0, 5);
		gbc_doswiadczenie.anchor = GridBagConstraints.WEST;
		gbc_doswiadczenie.gridx = 1;
		gbc_doswiadczenie.gridy = 5;
		klasa_pd.add(doswiadczenie, gbc_doswiadczenie);
		
		JPanel atrybuty = new JPanel();
		atrybuty.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Atrybuty", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(atrybuty, "cell 0 2,grow");
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		atrybuty.setLayout(gbl_panel_2);
		
		JLabel lblSia = new JLabel("Si\u0142a: ");
		GridBagConstraints gbc_lblSia = new GridBagConstraints();
		gbc_lblSia.insets = new Insets(0, 0, 5, 5);
		gbc_lblSia.gridx = 0;
		gbc_lblSia.gridy = 0;
		atrybuty.add(lblSia, gbc_lblSia);
		
		sila = new JSpinner();
		GridBagConstraints gbc_sila = new GridBagConstraints();
		gbc_sila.fill = GridBagConstraints.HORIZONTAL;
		gbc_sila.gridwidth = 3;
		gbc_sila.insets = new Insets(0, 0, 5, 5);
		gbc_sila.gridx = 1;
		gbc_sila.gridy = 0;
		atrybuty.add(sila, gbc_sila);
		
		JLabel lblSiaPsi = new JLabel("Si\u0142a Psi z rasy: ");
		GridBagConstraints gbc_lblSiaPsi = new GridBagConstraints();
		gbc_lblSiaPsi.insets = new Insets(0, 0, 5, 5);
		gbc_lblSiaPsi.gridx = 6;
		gbc_lblSiaPsi.gridy = 0;
		atrybuty.add(lblSiaPsi, gbc_lblSiaPsi);
		
		labelSilaPsi = new JLabel("");
		
		labelSilaPsi.setText((int)((Race)rasa.getSelectedItem()).psiPotent+"%");
		GridBagConstraints gbc_labelSilaPsi = new GridBagConstraints();
		gbc_labelSilaPsi.insets = new Insets(0, 0, 5, 0);
		gbc_labelSilaPsi.gridx = 7;
		gbc_labelSilaPsi.gridy = 0;
		atrybuty.add(labelSilaPsi, gbc_labelSilaPsi);
		
		JLabel lblZrczno = new JLabel("Zr\u0119czno\u015B\u0107: ");
		GridBagConstraints gbc_lblZrczno = new GridBagConstraints();
		gbc_lblZrczno.insets = new Insets(0, 0, 5, 5);
		gbc_lblZrczno.gridx = 0;
		gbc_lblZrczno.gridy = 1;
		atrybuty.add(lblZrczno, gbc_lblZrczno);
		
		zrecznosc = new JSpinner();
		GridBagConstraints gbc_zrecznosc = new GridBagConstraints();
		gbc_zrecznosc.gridwidth = 3;
		gbc_zrecznosc.fill = GridBagConstraints.HORIZONTAL;
		gbc_zrecznosc.insets = new Insets(0, 0, 5, 5);
		gbc_zrecznosc.gridx = 1;
		gbc_zrecznosc.gridy = 1;
		atrybuty.add(zrecznosc, gbc_zrecznosc);
		
		
		JLabel lblPsionik = new JLabel("Psionik: ");
		GridBagConstraints gbc_lblPsionik = new GridBagConstraints();
		gbc_lblPsionik.insets = new Insets(0, 0, 5, 5);
		gbc_lblPsionik.gridx = 6;
		gbc_lblPsionik.gridy = 1;
		atrybuty.add(lblPsionik, gbc_lblPsionik);
		
		labelPsionika = new JLabel("HEH");
		GridBagConstraints gbc_labelPsionika = new GridBagConstraints();
		gbc_labelPsionika.insets = new Insets(0, 0, 5, 0);
		gbc_labelPsionika.gridx = 7;
		gbc_labelPsionika.gridy = 1;
		atrybuty.add(labelPsionika, gbc_labelPsionika);
		
		JLabel lblWytrzymao = new JLabel("Wytrzyma\u0142o\u015B\u0107: ");
		GridBagConstraints gbc_lblWytrzymao = new GridBagConstraints();
		gbc_lblWytrzymao.insets = new Insets(0, 0, 5, 5);
		gbc_lblWytrzymao.gridx = 0;
		gbc_lblWytrzymao.gridy = 2;
		atrybuty.add(lblWytrzymao, gbc_lblWytrzymao);
		
		wytrzymalosc = new JSpinner();
		GridBagConstraints gbc_wytrzymalosc = new GridBagConstraints();
		gbc_wytrzymalosc.gridwidth = 3;
		gbc_wytrzymalosc.fill = GridBagConstraints.HORIZONTAL;
		gbc_wytrzymalosc.insets = new Insets(0, 0, 5, 5);
		gbc_wytrzymalosc.gridx = 1;
		gbc_wytrzymalosc.gridy = 2;
		atrybuty.add(wytrzymalosc, gbc_wytrzymalosc);
		
		
		JLabel lblPozostaePunkty = new JLabel("Pozosta\u0142e punkty: ");
		GridBagConstraints gbc_lblPozostaePunkty = new GridBagConstraints();
		gbc_lblPozostaePunkty.insets = new Insets(0, 0, 5, 5);
		gbc_lblPozostaePunkty.gridx = 6;
		gbc_lblPozostaePunkty.gridy = 2;
		atrybuty.add(lblPozostaePunkty, gbc_lblPozostaePunkty);
		
		//TODO: dodac zmiane tego gowna przy zmianie wartosci spinnerow odpowiednich atrybutow.
		//ciezko bedzie wylaczyc edytowanie, kiedy przekroczy ta wartosc. Do przemyslenia.
		int rand = (int)((Math.random()*6+1) + (Math.random()*6+1) + (Math.random()*6+1)) + 3;
		JLabel labelPunktyUmiejetnosci = new JLabel(rand+"");
		GridBagConstraints gbc_labelPunktyUmiejetnosci = new GridBagConstraints();
		gbc_labelPunktyUmiejetnosci.insets = new Insets(0, 0, 5, 0);
		gbc_labelPunktyUmiejetnosci.gridx = 7;
		gbc_labelPunktyUmiejetnosci.gridy = 2;
		atrybuty.add(labelPunktyUmiejetnosci, gbc_labelPunktyUmiejetnosci);
		
		JLabel lblNewLabel_1 = new JLabel("Inteligencja: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		atrybuty.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		inteligencja = new JSpinner();
		GridBagConstraints gbc_inteligencja = new GridBagConstraints();
		gbc_inteligencja.gridwidth = 3;
		gbc_inteligencja.fill = GridBagConstraints.HORIZONTAL;
		gbc_inteligencja.insets = new Insets(0, 0, 5, 5);
		gbc_inteligencja.gridx = 1;
		gbc_inteligencja.gridy = 3;
		atrybuty.add(inteligencja, gbc_inteligencja);
		
		JLabel lblNewLabel_2 = new JLabel("Charyzma");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		atrybuty.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		charyzma = new JSpinner();
		GridBagConstraints gbc_charyzma = new GridBagConstraints();
		gbc_charyzma.gridwidth = 3;
		gbc_charyzma.fill = GridBagConstraints.HORIZONTAL;
		gbc_charyzma.insets = new Insets(0, 0, 5, 5);
		gbc_charyzma.gridx = 1;
		gbc_charyzma.gridy = 4;
		atrybuty.add(charyzma, gbc_charyzma);
		
		JLabel lblPsionika = new JLabel("Psionika");
		GridBagConstraints gbc_lblPsionika = new GridBagConstraints();
		gbc_lblPsionika.insets = new Insets(0, 0, 5, 5);
		gbc_lblPsionika.gridx = 0;
		gbc_lblPsionika.gridy = 5;
		atrybuty.add(lblPsionika, gbc_lblPsionika);
		
		psionika = new JSpinner();
		GridBagConstraints gbc_psionika = new GridBagConstraints();
		gbc_psionika.gridwidth = 3;
		gbc_psionika.fill = GridBagConstraints.HORIZONTAL;
		gbc_psionika.insets = new Insets(0, 0, 5, 5);
		gbc_psionika.gridx = 1;
		gbc_psionika.gridy = 5;
		atrybuty.add(psionika, gbc_psionika);
		
		JLabel lblSzczcie = new JLabel("Szcz\u0119\u015Bcie: ");
		GridBagConstraints gbc_lblSzczcie = new GridBagConstraints();
		gbc_lblSzczcie.insets = new Insets(0, 0, 0, 5);
		gbc_lblSzczcie.gridx = 0;
		gbc_lblSzczcie.gridy = 6;
		atrybuty.add(lblSzczcie, gbc_lblSzczcie);
		
		JSpinner szczescie = new JSpinner();
		szczescie.setModel(new SpinnerNumberModel(1, 1, 1, 1));
		GridBagConstraints gbc_szczescie = new GridBagConstraints();
		gbc_szczescie.gridwidth = 3;
		gbc_szczescie.fill = GridBagConstraints.HORIZONTAL;
		gbc_szczescie.insets = new Insets(0, 0, 0, 5);
		gbc_szczescie.gridx = 1;
		gbc_szczescie.gridy = 6;
		atrybuty.add(szczescie, gbc_szczescie);
		
		//TODO: no...zdolnosci zrob
		JPanel zdolnosci = new JPanel();
		zdolnosci.setBorder(new TitledBorder(null, "Zdolno\u015Bci", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(zdolnosci, "cell 0 3,grow");
		
		JLabel lblIHaveNo = new JLabel("I HAVE NO IDEA. RLY");
		zdolnosci.add(lblIHaveNo);
		
		JPanel buttony = new JPanel();
		getContentPane().add(buttony, "cell 0 4,grow");
		buttony.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnClear = new JButton("Wyczy\u015B\u0107");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				clearFields();
				
			}});
		
		buttony.add(btnClear);
		
		JButton btnSave = new JButton("Zapisz");
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				saveChar();
			}});
		buttony.add(btnSave);
		
		JButton btnWyjdz = new JButton("Anuluj");
		btnWyjdz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				//wlasciwe wyjscie? prawdop dzia³a. ew sprawdziæ w wp³yw na pamiêæ, czy coœ.
				dispose();
			}});
		buttony.add(btnWyjdz);
		
	}
	private void clearFields() 
	{
		// TODO wyczysc fieldy. Like, wszystkie.
		imie.setText("");
		nazwisko.setText("");
		rasa.setSelectedIndex(0);
		plec.setText("");
		wiek.setValue(0);
		wzrost.setValue(0);
		waga.setValue(0);
		kO.setText("");
		kW.setText("");
		znakiSzczegolne.setText("");
		
		zawod.setText("");
		rep.setText("");
		stanowisko.setText("");
		slawa.setValue(0);
		poziom.setValue(0);
		staz.setValue(0);
		punktyStazu.setValue(0);
		doswiadczenie.setValue(0);
		
		sila.setValue(0);
		zrecznosc.setValue(0);
		wytrzymalosc.setValue(0);
		inteligencja.setValue(0);
		charyzma.setValue(0);
		psionika.setValue(0);
		
		//na razie tyle, more to come.
		
		
		
	}
	private void saveChar() {
		// TODO stworz hero z fieldow, zapisz go do obiektu, skorzystaj z xstream zeby przeksztalcic go do xmla, zapisz do pliku i wylacz okno.
		String name = imie.getText();
		String surnm = nazwisko.getText();
		
		
	}
	void loadRaces() {
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
	
	

}
