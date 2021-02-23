package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("2 이상의 정수 입력");
		System.out.print(">>");
		int KeyNum = scan.nextInt();

		for (int index = 2; index < KeyNum; index++) {

			if (KeyNum % index == 0) {
				System.out.println("소수가 아니다");
				break;
			}

		}
		
		int pos = 0;
		for(pos = 2; pos < KeyNum ; pos++) {
			if(KeyNum % pos == 0) {
				break;
			}
		}

		// pos의 값은?
		System.out.println(pos);
		// for 반복문이 중간에 break 되면
		// 		항상 pos < KeyNum 관계가 된다
		
		// 조건문이 하늘이 무너져고 true인 경우를 먼저 찾아라
		if(pos < KeyNum) {
			System.out.println(KeyNum + "는 소수가 아님");
		
			// for 반복문이 break 없이 모두 완료되었으면
		}else {
			System.out.println(KeyNum + "는 소수임");
		}
	}

}
