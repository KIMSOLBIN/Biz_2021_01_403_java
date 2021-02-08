package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {
		
		int intSum = 0;
		// 0 - 99 - > 7 - 106 // 1 - 100 -> 1+
		for(int i = 0; i < 100 ; i++) {
			
			boolean bYes = (i + 7)% 3 == 0;
			
			if(bYes) {
			
				intSum += i + 7;
			}
		}
		
		System.out.println(intSum);
	}
}
