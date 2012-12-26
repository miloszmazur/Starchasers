package com.lds.charsheet;


public class Attribute 
{
	double dexternity;
	double endurance;
	double inteligence;
	double charisma;
	double psi; 	
	double luck;
	
	public Attribute() {
		dexternity = 0;
		endurance = 0;
		inteligence = 0;
		charisma = 0;
		psi = 0;
		luck = 1;
	}
	
	
	public Attribute(double dexternity,double endurance,double inteligence,double charisma,double psi, double luck) {
		this.dexternity = dexternity;
		this.endurance = endurance;
		this.inteligence = inteligence;
		this.charisma = charisma;
		this.psi = psi;
		this.luck = luck;
	}
}