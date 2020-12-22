package com.day1.problem1;

public class SpeedConverter {

			long milesPerHour;
			public void toMilesPerHour(double kilometersPerHour)
			{
				milesPerHour = (long)(kilometersPerHour/1.609);
				PrintSpeedConverter(milesPerHour);
			}
			
			public void PrintSpeedConverter(long milerPerHour)
			{
				System.out.println("The speed in Miles/ Hours is " +milesPerHour);
			}
			
		
	}



