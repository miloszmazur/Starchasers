package com.lds.charsheet;

public class Race 
{
	String name;
	double psiPotent;
	
	public Race(String name, double psiPotent)
	{
		this.name = name;
		this.psiPotent = psiPotent;
	}
	
	
	public String toString()
	{
		return name;
	}
}