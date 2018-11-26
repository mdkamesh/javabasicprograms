package com.dxc;

import java.util.Scanner;

public class ReverseOfaString {
	
	public static void main(String... ar){
		
		// Method 1 Using StringBuffer
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String originalData = scr.nextLine();
		System.out.println("Reverse Of a String : "+new StringBuffer(originalData).reverse());
		scr.close();
		
		// Method 2 Using for Loop
		
		String reverseData = "";
		
		for(int i = originalData.length()-1; i>=0 ;i--){
			reverseData = reverseData + originalData.charAt(i);
		}
		
		System.out.println("Reverse of a String : "+reverseData);
		
		
		
		
		
		
		
		
		
		
		
	}

}
