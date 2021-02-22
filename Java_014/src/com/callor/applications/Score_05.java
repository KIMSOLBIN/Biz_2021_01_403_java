package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		int[] Sum = new int[3];
		float[] flg = new float[3];

		String[] strName = new String[3];
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		Random rnd = new Random();

		for (int index = 0; index < intKor.length; index++) {

			// 학생별로 점수를 나타내는 코드
			int num = rnd.nextInt(100) + 1;

			intKor[index] = num;
			intEng[index] = rnd.nextInt(100) + 1;
			intMath[index] = rnd.nextInt(100) + 1;

			// 학생별로 총점을 계산하는 코드
			Sum[index] = intKor[index];
			Sum[index] += intEng[index];
			Sum[index] += intMath[index];
			
			// 학생별로 평균을 계산하는 코드
			flg[index] = Sum[index]/3.0F;
			
			
			

		}

		//성적리스트 제목 출력
		System.out.println("=======================");
		System.out.println("빛나리 학습 성적일람표");
		System.out.println("==================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------");

		for (int index = 0; index < strName.length; index++) {

			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[index], intKor[index], intEng[index], intMath[index],Sum[index],flg[index]);

		}
		System.out.println("--------------------------------------------------");

	}
}
