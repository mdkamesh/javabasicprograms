package com.dxc;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String... ar){
		
		 int n, a = 0, b = 0, c = 1;
	        Scanner scr = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = scr.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
	        
	        scr.close();
	        
		
	}

}
