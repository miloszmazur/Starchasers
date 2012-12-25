package com.lds.charsheet;

public class Race 
{
	String name;
	double psi_potent;
	
	public Race(String name, double psi_potent)
	{
		this.name = name;
		this.psi_potent = psi_potent;
	}
	
	
	public String toString()
	{
		return name;
	}
}