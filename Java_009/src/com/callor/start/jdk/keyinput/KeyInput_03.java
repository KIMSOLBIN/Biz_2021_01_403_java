package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력>>");
		int num1 = scan.nextInt();
		int num2 = rnd.nextInt(100) + 1;
		
		// 1. num2 < num1 이냐?
		//	맞으면 " 큰값 " 표시하고 종료
		if(num2 < num1) {
			System.out.print(num2 + "보다 크다");
		}
		
		// 2. 그렇지 않으면 num2 == num1 이냐?
		//	맞으면 " 같다 " 표시하고 종료
		if(num2 == num1) {
			System.out.println(num2 + "와 같다");
		}
		// 3. 그렇지 않으면 num2 > num1 이냐?
		//	맞으면 " 작다 " 표시하고 종료
		if(num2 > num1) {
			System.out.println(num2 + "보다 작다");
		}
		
		
		
	}
}
