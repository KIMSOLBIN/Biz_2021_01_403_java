package com.callor.student;
/*
 * ======================
 * 구구단 7단
 * ----------------------
 * 7 X 1 = 7
 * 7 X 2 = 
 * 7 X 3 = 
 * 7 X 4 = 
 * 7 X 5 = 
 * 7 X 6 = 
 * 7 X 7 = 
 * 7 X 8 = 
 * 7 X 9 = 
 * ======================
 */
public class Ex_10 {
	
	public static void main(String[] args) {
		
		
		System.out.println("================");
		System.out.println("구구단 7단");
		System.out.println("----------------");
		
		int sum = 0;
		int num1 = 0;
		int num2 = 7;
		for(int i = 0 ; i < 9 ; i++) {
			
			num1 = i + 1;
			
			sum = num2 * num1;
			
			
			System.out.println(num2 + "X" + num1 + "=" + sum);
			
			
			
			
		}
		System.out.println("=================");
	}

}
