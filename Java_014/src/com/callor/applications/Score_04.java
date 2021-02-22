package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Score_04 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		String[] strName = new String[3];
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		Random rnd = new Random();

		for (int index = 0; index < strName.length; index++) {

			int num = rnd.nextInt(100) + 1;
			int num2 = rnd.nextInt(100) + 1;
			int num3 = rnd.nextInt(100) + 1;
			

			intKor[index] = num;


			intEng[index] = num2;


			intMath[index] = num3;

		}

		System.out.println("========================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("------------------------");

		for (int index = 0; index < strName.length; index++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[index], intKor[index], intEng[index], intMath[index]);

		}
		System.out.println("------------------------");

	}

}
