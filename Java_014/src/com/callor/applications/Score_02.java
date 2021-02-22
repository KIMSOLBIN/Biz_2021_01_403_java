package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int index = 0; index < strName.length; index++) {
			System.out.println("이름을 입력하세요");
			System.out.print("이름 >>");
			strName[index] = scan.nextLine();

			System.out.print("국어점수 입력 :");
			// 문자열형으로 입력받고
			String strSubj = scan.nextLine();
			//문자열형숫자를 정수로 변경하여 저장
			intKor[index]  = Integer.valueOf(strSubj);

			System.out.print("영어점수 입력 :");
			strSubj = scan.nextLine();
			intEng[index]  = Integer.valueOf(strSubj);

			System.out.print("수학점수  입력 :");
			strSubj = scan.nextLine();
			intMath[index]  = Integer.valueOf(strSubj);
			
		}
		System.out.println("===========================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------");

		for (int index = 0; index < strName.length; index++)
		
			System.out.printf("%s\t%d\t%d\t%d\n",strName[index], intKor[index], intEng[index], intMath[index]);

		System.out.println("---------------------------");

	}
}
