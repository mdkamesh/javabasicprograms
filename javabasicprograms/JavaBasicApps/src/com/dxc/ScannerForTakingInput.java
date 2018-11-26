package com.dxc;

import java.util.Scanner;

public class ScannerForTakingInput {
	
	public static void main(String... ar){
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Input Data : ");
		String inputData = scr.nextLine();
		System.out.println(inputData);
		scr.close();
		
	}

}
