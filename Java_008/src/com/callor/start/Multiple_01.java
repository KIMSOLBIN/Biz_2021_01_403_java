package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {
		
		int intSum1 = 0;
		// 0 - 99 - > 7 - 106 // 1 - 100 -> 1+

		for(int i = 0; i < 100 ; i++) {
			
			boolean bYes = (i + 7)% 3 == 0;
			
			if(bYes) {
			
				intSum1 += i + 7;
			}
		}
		
		System.out.println(intSum1);
		
		
		// 7 ~ 106
		int int3M = 0;
		
		for(int i = 0; i < 100; i++) {
			
			int num = i + 7;
			
			boolean bYes = num % 3 == 0;
			
			// if(num % 3 == 0){
			// if(bYes == true)
			if(bYes) {
				int3M += num;
				System.out.println(num + "는 3의 배수");
				
			}
				
		}
		
		System.out.println(int3M);
		
		
	}
}
