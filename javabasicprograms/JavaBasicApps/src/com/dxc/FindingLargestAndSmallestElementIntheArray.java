package com.dxc;

public class FindingLargestAndSmallestElementIntheArray {
	
	public static void main(String[] ar) {
		
		int[] ary = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};
		
		int largestElement = ary[0];
		int smallestElement = ary[0];
		
		for(int i=1; i<ary.length;i++) {
			
			if(ary[i] > largestElement) {
				largestElement = ary[i];
			}
			if(ary[i] < smallestElement) {
				smallestElement = ary[i];
			}
		}
		
		System.out.println("Largest Element : "+largestElement);
		System.out.println("Smallest Element : "+smallestElement);
		
		
	}

}
