package com.day1.problem1;
import java.util.Scanner;

public class MainSpeedConverter {

	public static void main(String[] args) {
		SpeedConverter object = new SpeedConverter();
		Scanner input = new Scanner(System.in);
	    double  kilometersPerHour;
	    System.out.println("Enter the value for kilometersPerHour ");
	    kilometersPerHour = input.nextDouble();
		object.toMilesPerHour(kilometersPerHour);

	}

}
