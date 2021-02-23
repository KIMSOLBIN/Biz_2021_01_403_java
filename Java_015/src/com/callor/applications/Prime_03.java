package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상의 정수 입력 >>");
		int KeyNum = scan.nextInt();
		
		PrimeServiceV2 ccV2 = new PrimeServiceV2();
		
		int result = ccV2.prime(KeyNum); // PrimeServiceV2에 있는 코드를 다시 result(결과)로 불려와서
		if(result < 0) { 
			System.out.println(KeyNum + "는 소수가 아님");
		} else {
			System.out.println(KeyNum + "는 소수"); // result(결과)로 PrimeServiceV2에 있는 코드의 값을 System.out.println로 출력한다.
		}
		
	}

}
