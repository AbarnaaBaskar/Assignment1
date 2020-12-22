package com.day1.problem2;

public class FeetToCentimeter {
	double centimeter;
	public void feetToCentimeter(int feet)
	{
		centimeter = feet * 30.48;
		printFeetToCentimeter(centimeter);
	
	}
	public void feetToCentimeter(double feet)
	{
		centimeter = feet * 30.48;
		printFeetToCentimeter(centimeter);
	
	}
	
	public void printFeetToCentimeter(double centimeter)
	{
		System.out.println("Feet in Centemeters is "+ centimeter);
	}
	

}
