package com.dxc;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovingDuplicatesFromGivenString {
	
	public static void main(String... ar){
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String originalData = scr.nextLine();
		
		char[] chars = originalData.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
		
		scr.close();
		
	}

}
