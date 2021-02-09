package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_02 {
	
	public static void main(String[] args) {
		
		System.out.println();
		
		//Scanner 클래스를 객체로 생성하면서
		// 운영체제의 키보드 시스템과 연결한다
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력>>");
		int intNum1 = scan.nextInt();
		
		if(intNum1 % 2 ==0) {
			System.out.println(intNum1 + "은(는) 짝수");
		}else {
			System.out.println(intNum1 + "은(는) 홀수");
		}
	}

}
