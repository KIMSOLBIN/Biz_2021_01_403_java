package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 10 까지의 정수");
		System.out.print("숫자입력 >>");
		int KeyNum = scan.nextInt();
		
		for(int f = 0 ; f < intNums.length ; f++) {
			
			if(intNums[f] == KeyNum) {
				
				System.out.println(KeyNum + "값 최초의 번호" + f);
				
				break; // 값이 하나로 나와야 할때
			}
		}
		
	}

}
