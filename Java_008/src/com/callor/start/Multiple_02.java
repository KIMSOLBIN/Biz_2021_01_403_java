package com.callor.start;

public class Multiple_02 {

	public static void main(String[] args) {
		
		int Sum1 = 0;
		int Sum2 = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = i + 7 ;
			
			boolean bYes = num % 3 == 1;
			boolean bYES = num % 3 == 2;
			
			
			if(bYes) {
				Sum1 += num;
			}
			if(bYES) {
				Sum2 += num;
			}
			
		}
		
		System.out.println(Sum1 + Sum2);
		
		
		// ~ 범위의 값을 덧셈(합산, 누적)용 변수선언
		int intSum = 0;
		
		for(int i = 0 ; i < 100; i++) {
			int num = i + 7;
			boolean bYes1 = num % 3 == 1;
			if(bYes1) {
				intSum += num;
				
			}
			
			boolean bYes2 = num % 3 == 2;
			if(bYes2) {
				intSum += num;
			}
			
			
		}
		
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
		
		intSum = 0;
		for(int i = 0; i < 100; i++) {
			
			int num =  i + 7;
			boolean bYes = num % 3 == 0;
			if( !bYes ) {
				intSum += num;
			}
		}
		
		intSum = 0;
		for(int i = 0; i < 100; i++) {
			
			int num = 1 + 7;
			boolean bYes = num % 3 != 0;
			if( bYes ) {
				intSum += num;
			}
		}
		
		
		
		
	}
}
