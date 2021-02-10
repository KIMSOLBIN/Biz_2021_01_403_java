package com.callor.applications;

import java.util.Scanner;

public class App_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력(2 ~ 9) >>");
		int num1 = scan.nextInt();
		
		System.out.println("===================");
		System.out.println("구구단" + num1 + "단");
		System.out.println("-------------------");
		
		for(int i = 0; i < 8 ; i++) {
			
			int num2 = i + 2;
			System.out.print( num1 );
			System.out.print( " X " );
			System.out.print( num2 );
			System.out.print( " = ");
			System.out.println( num1 * num2 );
				
 		}
		
		
	}

}
