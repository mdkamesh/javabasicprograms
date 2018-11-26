package com.dxc;

import java.util.Scanner;

public class Palidrom {
	
	public static void main(String... ar){
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Input Data : ");
		String originalData = scr.nextLine();
		
		String reverseString = "";
		
		
		for(int i = originalData.length()-1; i>=0 ;i--){
			reverseString = reverseString + originalData.charAt(i);
		}
		
		if(originalData.equals(reverseString)){
			System.out.println("This is a Palindrom : "+reverseString);
		}
		else{
			System.out.println("This is not a Palindrom : "+originalData);
		}
		scr.close();
	}

}
