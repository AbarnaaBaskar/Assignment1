package com.day1.problem2;
import java.util.Scanner;

public class MainFeetToCentimeter {
	public static void main(String[] args)
	{
		FeetToCentimeter object = new FeetToCentimeter();
		Scanner input = new Scanner(System.in);
		int methodDecider;
		System.out.println("Enter 1 for interger value and 2 for double value"+"\n");
		methodDecider = input.nextInt();
		System.out.println("Enter the feet value ");
		if (methodDecider == 1)
		{
			int feet = input.nextInt();
			object.feetToCentimeter(feet);
		}
		else
		{
			double feet = input.nextDouble();
			object.feetToCentimeter(feet);
		}
	}

}
