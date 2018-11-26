package com.dxc;

import java.util.Scanner;

public class ReverseOfaString {
	
	public static void main(String... ar){
		
		// Method 1 Using StringBuffer
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputData = scr.nextLine();
		System.out.println(new StringBuffer(inputData).reverse());
		scr.close();
		
	}

}
