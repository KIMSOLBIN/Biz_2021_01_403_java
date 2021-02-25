package com.callor.oop.exp;

import java.util.Scanner;

public class Exception_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("==============================");
			System.out.println("0 이상 정수를 입력하세요");
			System.out.println("------------------------------");
			System.out.print(">>");
			String strNum = scan.nextLine();
			
			int intNum = 0;
			
			try {
				intNum = Integer.valueOf(strNum);
				
			} catch (NumberFormatException e) {
				System.out.println("반드시 숫자만 입력하세요");

				continue; // while(true)문으로 다시 돌아가서 다시 입력할수 있게 하는 코드
			}
			
			if(intNum <0 ) {
				System.out.println("0 이상 값만 입력하세요");
				
			}else {
				System.out.println("입력값 :" + intNum);
				break; // 문장이 알맞게 입력이 되면 멈추고 다음으로 실행하게 하는 코드
					   //  멈추기 때문에 다음으로 입력이 안됨.
			}
			
		}
	}
}
