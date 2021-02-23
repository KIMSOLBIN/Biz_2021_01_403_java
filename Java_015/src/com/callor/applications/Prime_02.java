package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV1;

public class Prime_02 {

	public static void main(String[] args) {

		PrimeServiceV1 ccV1 = new PrimeServiceV1();

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 >>");
		int KeyNum = scan.nextInt();
		
		ccV1.prime(KeyNum); // PrimeServiceV1에 Scanner 코드로 만든 것을 넘긴다.

	}
}
