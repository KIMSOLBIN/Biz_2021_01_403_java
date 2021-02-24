package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺾정" };

		String[] strAddr = { "서울시", "익산시", "남원시", "한양시", "함흥시" };

		int strsubject = strName.length; // 학생수가 늘어가도 가능

		int[] intKor = new int[strsubject]; 
		int[] intEng = new int[strsubject];
		int[] intMath = new int[strsubject];

		Random rnd = new Random();

		int[] intSum = new int[strsubject];
		float[] floatAvg = new float[strsubject];
		// 점수생성
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;

		}
		// 총점
		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] = intMath[i];
		}

		// 평균계산
		for (int i = 0; i < strName.length; i++) {
			floatAvg[i] = (float) intSum[i] / 3;
		}

		System.out.println("==============================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총합");
		System.out.println("==============================================");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%3.2f\n", strName[i], strAddr[i], intKor[i], intEng[i], intMath[i],
					floatAvg[i]);
			System.out.println("-----------------------------------------------");
		}
	}
}