package com.day1.problem3;
import java.util.*;

public class MainCarpetCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the room");
		int length = input.nextInt();
		System.out.println("Enter the width of the room");
		int width = input.nextInt();
		System.out.println("Enter the price of the carpet");
		int price = input.nextInt();
		RoomCarpet object = new RoomCarpet(length, width, price);
		object.printTotalPrice();
		}

}
