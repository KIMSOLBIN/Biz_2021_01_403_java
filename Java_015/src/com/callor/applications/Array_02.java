package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 ~ 10까지의 정수");
		System.out.print("숫자입력 >>");
		int KeyNum = scan.nextInt();

		
		for(int f = 0 ; f < intNums.length ; f++) {
		
			boolean bYes = intNums[f] == KeyNum;
			if(bYes) {
				System.out.println(KeyNum + " 값 저장 위치"+f);
			}
			
		}
		
	}
	
}
