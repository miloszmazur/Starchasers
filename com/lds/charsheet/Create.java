package com.lds.charsheet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
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


	public static void main(String[] args) {
					Create frame = new Create();
					frame.setVisible(true);
	}

	public Create() 
	{
		setTitle("Starchasers lol");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 665);
		setResizable(false);
		getContentPane().setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][grow]"));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Podstawowe Informacje", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel, "cell 0 0,grow");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblImi = new JLabel("Imi\u0119: ");
		GridBagConstraints gbc_lblImi = new GridBagConstraints();
		gbc_lblImi.insets = new Insets(0, 0, 5, 5);
		gbc_lblImi.gridx = 0;
		gbc_lblImi.gridy = 0;
		panel.add(lblImi, gbc_lblImi);
		
		imie = new JTextField();
		GridBagConstraints gbc_imie = new GridBagConstraints();
		gbc_imie.fill = GridBagConstraints.HORIZONTAL;
		gbc_imie.insets = new Insets(0, 0, 5, 5);
		gbc_imie.gridx = 1;
		gbc_imie.gridy = 0;
		panel.add(imie, gbc_imie);
		imie.setColumns(10);
		
		JLabel lblWzrost = new JLabel("Wzrost: ");
		GridBagConstraints gbc_lblWzrost = new GridBagConstraints();
		gbc_lblWzrost.insets = new Insets(0, 0, 5, 5);
		gbc_lblWzrost.gridx = 2;
		gbc_lblWzrost.gridy = 0;
		panel.add(lblWzrost, gbc_lblWzrost);
		
		JSpinner wzrost = new JSpinner();
		GridBagConstraints gbc_wzrost = new GridBagConstraints();
		gbc_wzrost.insets = new Insets(0, 0, 5, 5);
		gbc_wzrost.gridx = 3;
		gbc_wzrost.gridy = 0;
		panel.add(wzrost, gbc_wzrost);
		
		JLabel lblNazwisko = new JLabel("Nazwisko: ");
		GridBagConstraints gbc_lblNazwisko = new GridBagConstraints();
		gbc_lblNazwisko.insets = new Insets(0, 0, 5, 5);
		gbc_lblNazwisko.gridx = 0;
		gbc_lblNazwisko.gridy = 1;
		panel.add(lblNazwisko, gbc_lblNazwisko);
		
		nazwisko = new JTextField();
		GridBagConstraints gbc_nazwisko = new GridBagConstraints();
		gbc_nazwisko.fill = GridBagConstraints.HORIZONTAL;
		gbc_nazwisko.insets = new Insets(0, 0, 5, 5);
		gbc_nazwisko.gridx = 1;
		gbc_nazwisko.gridy = 1;
		panel.add(nazwisko, gbc_nazwisko);
		nazwisko.setColumns(10);
		
		JLabel lblWaga = new JLabel("Waga: ");
		GridBagConstraints gbc_lblWaga = new GridBagConstraints();
		gbc_lblWaga.insets = new Insets(0, 0, 5, 5);
		gbc_lblWaga.gridx = 2;
		gbc_lblWaga.gridy = 1;
		panel.add(lblWaga, gbc_lblWaga);
		
		JSpinner waga = new JSpinner();
		GridBagConstraints gbc_waga = new GridBagConstraints();
		gbc_waga.insets = new Insets(0, 0, 5, 5);
		gbc_waga.gridx = 3;
		gbc_waga.gridy = 1;
		panel.add(waga, gbc_waga);
		
		JLabel lblRasa = new JLabel("Rasa: ");
		GridBagConstraints gbc_lblRasa = new GridBagConstraints();
		gbc_lblRasa.insets = new Insets(0, 0, 5, 5);
		gbc_lblRasa.gridx = 0;
		gbc_lblRasa.gridy = 2;
		panel.add(lblRasa, gbc_lblRasa);
		
		JComboBox rasa = new JComboBox();
		GridBagConstraints gbc_rasa = new GridBagConstraints();
		gbc_rasa.fill = GridBagConstraints.HORIZONTAL;
		gbc_rasa.insets = new Insets(0, 0, 5, 5);
		gbc_rasa.gridx = 1;
		gbc_rasa.gridy = 2;
		panel.add(rasa, gbc_rasa);
		
		JLabel lblKolorOczu = new JLabel("Kolor oczu");
		GridBagConstraints gbc_lblKolorOczu = new GridBagConstraints();
		gbc_lblKolorOczu.anchor = GridBagConstraints.EAST;
		gbc_lblKolorOczu.insets = new Insets(0, 0, 5, 5);
		gbc_lblKolorOczu.gridx = 2;
		gbc_lblKolorOczu.gridy = 2;
		panel.add(lblKolorOczu, gbc_lblKolorOczu);
		
		kO = new JTextField();
		GridBagConstraints gbc_kO = new GridBagConstraints();
		gbc_kO.insets = new Insets(0, 0, 5, 5);
		gbc_kO.fill = GridBagConstraints.HORIZONTAL;
		gbc_kO.gridx = 3;
		gbc_kO.gridy = 2;
		panel.add(kO, gbc_kO);
		kO.setColumns(10);
		
		JLabel lblPe = new JLabel("P\u0142e\u0107: ");
		GridBagConstraints gbc_lblPe = new GridBagConstraints();
		gbc_lblPe.anchor = GridBagConstraints.EAST;
		gbc_lblPe.insets = new Insets(0, 0, 5, 5);
		gbc_lblPe.gridx = 0;
		gbc_lblPe.gridy = 3;
		panel.add(lblPe, gbc_lblPe);
		
		plec = new JTextField();
		GridBagConstraints gbc_plec = new GridBagConstraints();
		gbc_plec.fill = GridBagConstraints.BOTH;
		gbc_plec.insets = new Insets(0, 0, 5, 5);
		gbc_plec.gridx = 1;
		gbc_plec.gridy = 3;
		panel.add(plec, gbc_plec);
		plec.setColumns(10);
		
		JLabel lblKolorWosw = new JLabel("Kolor w\u0142os\u00F3w");
		GridBagConstraints gbc_lblKolorWosw = new GridBagConstraints();
		gbc_lblKolorWosw.anchor = GridBagConstraints.EAST;
		gbc_lblKolorWosw.insets = new Insets(0, 0, 5, 5);
		gbc_lblKolorWosw.gridx = 2;
		gbc_lblKolorWosw.gridy = 3;
		panel.add(lblKolorWosw, gbc_lblKolorWosw);
		
		kW = new JTextField();
		GridBagConstraints gbc_kW = new GridBagConstraints();
		gbc_kW.insets = new Insets(0, 0, 5, 5);
		gbc_kW.fill = GridBagConstraints.HORIZONTAL;
		gbc_kW.gridx = 3;
		gbc_kW.gridy = 3;
		panel.add(kW, gbc_kW);
		kW.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Wiek");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JSpinner wiek = new JSpinner();
		GridBagConstraints gbc_wiek = new GridBagConstraints();
		gbc_wiek.fill = GridBagConstraints.HORIZONTAL;
		gbc_wiek.insets = new Insets(0, 0, 5, 5);
		gbc_wiek.gridx = 1;
		gbc_wiek.gridy = 4;
		panel.add(wiek, gbc_wiek);
		
		JLabel lblZnakiSzczeglne = new JLabel("Znaki szczeg\u00F3lne: ");
		GridBagConstraints gbc_lblZnakiSzczeglne = new GridBagConstraints();
		gbc_lblZnakiSzczeglne.insets = new Insets(0, 0, 5, 5);
		gbc_lblZnakiSzczeglne.gridx = 2;
		gbc_lblZnakiSzczeglne.gridy = 4;
		panel.add(lblZnakiSzczeglne, gbc_lblZnakiSzczeglne);
		
		JEditorPane znakiSzczegolne = new JEditorPane();
		GridBagConstraints gbc_znakiSzczegolne = new GridBagConstraints();
		gbc_znakiSzczegolne.gridheight = 2;
		gbc_znakiSzczegolne.gridwidth = 3;
		gbc_znakiSzczegolne.insets = new Insets(0, 0, 0, 5);
		gbc_znakiSzczegolne.fill = GridBagConstraints.BOTH;
		gbc_znakiSzczegolne.gridx = 3;
		gbc_znakiSzczegolne.gridy = 4;
		panel.add(znakiSzczegolne, gbc_znakiSzczegolne);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Klasa i Do\u015Bwiadczenie", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_1, "cell 0 1,grow");
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {0, 0, 0, 0, 30, 30};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblZawd = new JLabel("Zaw\u00F3d: ");
		GridBagConstraints gbc_lblZawd = new GridBagConstraints();
		gbc_lblZawd.insets = new Insets(0, 0, 5, 5);
		gbc_lblZawd.gridx = 0;
		gbc_lblZawd.gridy = 0;
		panel_1.add(lblZawd, gbc_lblZawd);
		
		zawod = new JTextField();
		GridBagConstraints gbc_zawod = new GridBagConstraints();
		gbc_zawod.fill = GridBagConstraints.HORIZONTAL;
		gbc_zawod.insets = new Insets(0, 0, 5, 5);
		gbc_zawod.gridx = 1;
		gbc_zawod.gridy = 0;
		panel_1.add(zawod, gbc_zawod);
		zawod.setColumns(10);
		
		JLabel lblPs = new JLabel("PS: ");
		GridBagConstraints gbc_lblPs = new GridBagConstraints();
		gbc_lblPs.insets = new Insets(0, 0, 5, 5);
		gbc_lblPs.gridx = 2;
		gbc_lblPs.gridy = 0;
		panel_1.add(lblPs, gbc_lblPs);
		
		JSpinner punktyStazu = new JSpinner();
		GridBagConstraints gbc_punktyStazu = new GridBagConstraints();
		gbc_punktyStazu.insets = new Insets(0, 0, 5, 5);
		gbc_punktyStazu.gridx = 3;
		gbc_punktyStazu.gridy = 0;
		panel_1.add(punktyStazu, gbc_punktyStazu);
		
		JLabel lblReputacjaranga = new JLabel("Reputacja/Ranga: ");
		GridBagConstraints gbc_lblReputacjaranga = new GridBagConstraints();
		gbc_lblReputacjaranga.anchor = GridBagConstraints.EAST;
		gbc_lblReputacjaranga.insets = new Insets(0, 0, 5, 5);
		gbc_lblReputacjaranga.gridx = 0;
		gbc_lblReputacjaranga.gridy = 1;
		panel_1.add(lblReputacjaranga, gbc_lblReputacjaranga);
		
		rep = new JTextField();
		GridBagConstraints gbc_rep = new GridBagConstraints();
		gbc_rep.fill = GridBagConstraints.HORIZONTAL;
		gbc_rep.insets = new Insets(0, 0, 5, 5);
		gbc_rep.gridx = 1;
		gbc_rep.gridy = 1;
		panel_1.add(rep, gbc_rep);
		rep.setColumns(10);
		
		JLabel lblSta = new JLabel("Sta\u017C: ");
		GridBagConstraints gbc_lblSta = new GridBagConstraints();
		gbc_lblSta.insets = new Insets(0, 0, 5, 5);
		gbc_lblSta.gridx = 2;
		gbc_lblSta.gridy = 1;
		panel_1.add(lblSta, gbc_lblSta);
		
		JSpinner staz = new JSpinner();
		GridBagConstraints gbc_staz = new GridBagConstraints();
		gbc_staz.insets = new Insets(0, 0, 5, 5);
		gbc_staz.gridx = 3;
		gbc_staz.gridy = 1;
		panel_1.add(staz, gbc_staz);
		
		JLabel lblStanowisko = new JLabel("Stanowisko");
		GridBagConstraints gbc_lblStanowisko = new GridBagConstraints();
		gbc_lblStanowisko.insets = new Insets(0, 0, 5, 5);
		gbc_lblStanowisko.gridx = 0;
		gbc_lblStanowisko.gridy = 2;
		panel_1.add(lblStanowisko, gbc_lblStanowisko);
		
		stanowisko = new JTextField();
		GridBagConstraints gbc_stanowisko = new GridBagConstraints();
		gbc_stanowisko.fill = GridBagConstraints.HORIZONTAL;
		gbc_stanowisko.insets = new Insets(0, 0, 5, 5);
		gbc_stanowisko.gridx = 1;
		gbc_stanowisko.gridy = 2;
		panel_1.add(stanowisko, gbc_stanowisko);
		stanowisko.setColumns(10);
		
		JLabel lblSawa = new JLabel("S\u0142awa: ");
		GridBagConstraints gbc_lblSawa = new GridBagConstraints();
		gbc_lblSawa.insets = new Insets(0, 0, 5, 5);
		gbc_lblSawa.gridx = 0;
		gbc_lblSawa.gridy = 3;
		panel_1.add(lblSawa, gbc_lblSawa);
		
		JSpinner slawa = new JSpinner();
		GridBagConstraints gbc_slawa = new GridBagConstraints();
		gbc_slawa.insets = new Insets(0, 0, 5, 5);
		gbc_slawa.anchor = GridBagConstraints.WEST;
		gbc_slawa.gridx = 1;
		gbc_slawa.gridy = 3;
		panel_1.add(slawa, gbc_slawa);
		
		JLabel lblPoziom = new JLabel("Poziom");
		GridBagConstraints gbc_lblPoziom = new GridBagConstraints();
		gbc_lblPoziom.insets = new Insets(0, 0, 5, 5);
		gbc_lblPoziom.gridx = 0;
		gbc_lblPoziom.gridy = 4;
		panel_1.add(lblPoziom, gbc_lblPoziom);
		
		JSpinner poziom = new JSpinner();
		GridBagConstraints gbc_poziom = new GridBagConstraints();
		gbc_poziom.anchor = GridBagConstraints.WEST;
		gbc_poziom.fill = GridBagConstraints.VERTICAL;
		gbc_poziom.insets = new Insets(0, 0, 5, 5);
		gbc_poziom.gridx = 1;
		gbc_poziom.gridy = 4;
		panel_1.add(poziom, gbc_poziom);
		
		JLabel lblPd = new JLabel("PD: ");
		GridBagConstraints gbc_lblPd = new GridBagConstraints();
		gbc_lblPd.insets = new Insets(0, 0, 0, 5);
		gbc_lblPd.gridx = 0;
		gbc_lblPd.gridy = 5;
		panel_1.add(lblPd, gbc_lblPd);
		
		JSpinner doswiadczenie = new JSpinner();
		GridBagConstraints gbc_doswiadczenie = new GridBagConstraints();
		gbc_doswiadczenie.insets = new Insets(0, 0, 0, 5);
		gbc_doswiadczenie.anchor = GridBagConstraints.WEST;
		gbc_doswiadczenie.gridx = 1;
		gbc_doswiadczenie.gridy = 5;
		panel_1.add(doswiadczenie, gbc_doswiadczenie);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Atrybuty", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_2, "cell 0 2,grow");
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblSia = new JLabel("Si\u0142a: ");
		GridBagConstraints gbc_lblSia = new GridBagConstraints();
		gbc_lblSia.insets = new Insets(0, 0, 5, 5);
		gbc_lblSia.gridx = 0;
		gbc_lblSia.gridy = 0;
		panel_2.add(lblSia, gbc_lblSia);
		
		JSpinner sila = new JSpinner();
		GridBagConstraints gbc_sila = new GridBagConstraints();
		gbc_sila.insets = new Insets(0, 0, 5, 5);
		gbc_sila.gridx = 1;
		gbc_sila.gridy = 0;
		panel_2.add(sila, gbc_sila);
		
		JLabel lblSiaPsi = new JLabel("Si\u0142a Psi: ");
		GridBagConstraints gbc_lblSiaPsi = new GridBagConstraints();
		gbc_lblSiaPsi.insets = new Insets(0, 0, 5, 5);
		gbc_lblSiaPsi.gridx = 4;
		gbc_lblSiaPsi.gridy = 0;
		panel_2.add(lblSiaPsi, gbc_lblSiaPsi);
		
		JLabel labelSilaPsi = new JLabel("Random");
		GridBagConstraints gbc_labelSilaPsi = new GridBagConstraints();
		gbc_labelSilaPsi.insets = new Insets(0, 0, 5, 0);
		gbc_labelSilaPsi.gridx = 5;
		gbc_labelSilaPsi.gridy = 0;
		panel_2.add(labelSilaPsi, gbc_labelSilaPsi);
		
		JLabel lblZrczno = new JLabel("Zr\u0119czno\u015B\u0107: ");
		GridBagConstraints gbc_lblZrczno = new GridBagConstraints();
		gbc_lblZrczno.insets = new Insets(0, 0, 5, 5);
		gbc_lblZrczno.gridx = 0;
		gbc_lblZrczno.gridy = 1;
		panel_2.add(lblZrczno, gbc_lblZrczno);
		
		JSpinner zrecznosc = new JSpinner();
		GridBagConstraints gbc_zrecznosc = new GridBagConstraints();
		gbc_zrecznosc.insets = new Insets(0, 0, 5, 5);
		gbc_zrecznosc.gridx = 1;
		gbc_zrecznosc.gridy = 1;
		panel_2.add(zrecznosc, gbc_zrecznosc);
		
		JLabel lblPozostaePunkty = new JLabel("Pozosta\u0142e punkty: ");
		GridBagConstraints gbc_lblPozostaePunkty = new GridBagConstraints();
		gbc_lblPozostaePunkty.insets = new Insets(0, 0, 5, 5);
		gbc_lblPozostaePunkty.gridx = 4;
		gbc_lblPozostaePunkty.gridy = 1;
		panel_2.add(lblPozostaePunkty, gbc_lblPozostaePunkty);
		
		JLabel labelPunktyUmiejetnosci = new JLabel("Random");
		GridBagConstraints gbc_labelPunktyUmiejetnosci = new GridBagConstraints();
		gbc_labelPunktyUmiejetnosci.insets = new Insets(0, 0, 5, 0);
		gbc_labelPunktyUmiejetnosci.gridx = 5;
		gbc_labelPunktyUmiejetnosci.gridy = 1;
		panel_2.add(labelPunktyUmiejetnosci, gbc_labelPunktyUmiejetnosci);
		
		JLabel lblWytrzymao = new JLabel("Wytrzyma\u0142o\u015B\u0107: ");
		GridBagConstraints gbc_lblWytrzymao = new GridBagConstraints();
		gbc_lblWytrzymao.insets = new Insets(0, 0, 5, 5);
		gbc_lblWytrzymao.gridx = 0;
		gbc_lblWytrzymao.gridy = 2;
		panel_2.add(lblWytrzymao, gbc_lblWytrzymao);
		
		JSpinner wytrzymalosc = new JSpinner();
		GridBagConstraints gbc_wytrzymalosc = new GridBagConstraints();
		gbc_wytrzymalosc.insets = new Insets(0, 0, 5, 5);
		gbc_wytrzymalosc.gridx = 1;
		gbc_wytrzymalosc.gridy = 2;
		panel_2.add(wytrzymalosc, gbc_wytrzymalosc);
		
		JLabel lblNewLabel_1 = new JLabel("Inteligencja: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JSpinner inteligencja = new JSpinner();
		GridBagConstraints gbc_inteligencja = new GridBagConstraints();
		gbc_inteligencja.insets = new Insets(0, 0, 5, 5);
		gbc_inteligencja.gridx = 1;
		gbc_inteligencja.gridy = 3;
		panel_2.add(inteligencja, gbc_inteligencja);
		
		JLabel lblNewLabel_2 = new JLabel("Charyzma");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JSpinner charyzma = new JSpinner();
		GridBagConstraints gbc_charyzma = new GridBagConstraints();
		gbc_charyzma.insets = new Insets(0, 0, 5, 5);
		gbc_charyzma.gridx = 1;
		gbc_charyzma.gridy = 4;
		panel_2.add(charyzma, gbc_charyzma);
		
		JLabel lblPsionika = new JLabel("Psionika");
		GridBagConstraints gbc_lblPsionika = new GridBagConstraints();
		gbc_lblPsionika.insets = new Insets(0, 0, 5, 5);
		gbc_lblPsionika.gridx = 0;
		gbc_lblPsionika.gridy = 5;
		panel_2.add(lblPsionika, gbc_lblPsionika);
		
		JSpinner psionika = new JSpinner();
		GridBagConstraints gbc_psionika = new GridBagConstraints();
		gbc_psionika.insets = new Insets(0, 0, 5, 5);
		gbc_psionika.gridx = 1;
		gbc_psionika.gridy = 5;
		panel_2.add(psionika, gbc_psionika);
		
		JLabel lblSzczcie = new JLabel("Szcz\u0119\u015Bcie: ");
		GridBagConstraints gbc_lblSzczcie = new GridBagConstraints();
		gbc_lblSzczcie.insets = new Insets(0, 0, 0, 5);
		gbc_lblSzczcie.gridx = 0;
		gbc_lblSzczcie.gridy = 6;
		panel_2.add(lblSzczcie, gbc_lblSzczcie);
		
		JSpinner szczescie = new JSpinner();
		szczescie.setModel(new SpinnerNumberModel(1, 1, 1, 1));
		GridBagConstraints gbc_szczescie = new GridBagConstraints();
		gbc_szczescie.insets = new Insets(0, 0, 0, 5);
		gbc_szczescie.gridx = 1;
		gbc_szczescie.gridy = 6;
		panel_2.add(szczescie, gbc_szczescie);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Zdolno\u015Bci", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_4, "cell 0 3,grow");
		
		JLabel lblIHaveNo = new JLabel("I HAVE NO IDEA. RLY");
		panel_4.add(lblIHaveNo);
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3, "cell 0 4,grow");
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Wyczy\u015B\u0107");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_3.add(btnNewButton);
		
		JButton btnZapisz = new JButton("Zapisz");
		panel_3.add(btnZapisz);
	}

}
