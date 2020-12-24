package com.day1.problem3;

public class RoomCarpetIndia extends RoomDimension {
	
	int totalPrice;
	public RoomCarpetIndia(int length, int width, int price)
	{
		super(length,width);
		totalPrice =  (int) (length * width * price * 73.66);
	}
	public void printTotalPrice()
	{
		System.out.println("The Total Carpet Cost in INR is "+totalPrice);
	}
	

}
