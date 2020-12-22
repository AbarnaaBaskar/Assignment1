package com.day1.problem3;

public class RoomCarpet extends RoomDimension {
    int totalPrice;
	public RoomCarpet(int length, int width, int price) 
	{
		super(length, width);
		totalPrice = length * width * price;
		
	}
	public void printTotalPrice()
	{
		System.out.println("The Total Carpet Cost is "+totalPrice);
	}
	
	

	

}
