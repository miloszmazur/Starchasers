package com.lds.charsheet;

import java.io.Serializable;

public class Hero implements Serializable
{
	/**
	 * DAFUQ IS DIS
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String surnm;
	String race;
	String sex;
	int age;
	double height;
	double weight;
	String eyeColour;
	String hairColour;
	//cokolwiek, znaki szczegolne String lol;
	String profession;
	int reputation; //w doc string
	String currJob;
	int fame;
	int lvl;
	double pd;
	int staz; //the fuck
	int ps; //the fuck
	Attribute atr;
	
	public Hero(String name, String surname, String race, String sex, int age, 
			double height, double weight, String eC, String hC, String prof, int rep,
			String cJ, int fame, int lvl, double pd, int staz, int ps)
	{
		this.name = name;
		surnm= surname;
		this.race = race;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		eyeColour = eC;
		hairColour = hC;
		profession = prof;
		reputation = rep; //w dokumentacji jest to string, ale...
		currJob = cJ;
		this.fame = fame;
		this.lvl  = lvl;
		this.pd = pd;
		this.staz = staz; //the fuck
		this.ps = ps; //the fuck
		//this.atr = atr;
		
	}
	public Hero()
	{
		this.name = "";
		surnm = "";
		this.race = null;
		this.sex = "M";
		this.age = 20;
		this.height = 180;
		this.weight = 80;
		eyeColour = "blue";
		hairColour = "blond";
		profession = "baker";
		reputation = 0; //w doc string
		currJob = "pushover";
		fame = 0;;
		lvl  = 1;
		pd = 0;
		staz = 0; //the fuck
		ps = 0; //the fuck
		//atr = new Attribute();
	}
	
	public String toString()
	{
		return name + " " + surnm;
	}
	
}

