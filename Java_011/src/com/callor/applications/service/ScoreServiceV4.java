package com.callor.applications.service;

public class ScoreServiceV4 {
	
	// 총점과 평균을 전달받는 2개의 매개변수가 있는 score()
	
	// 총점과 평균을 매개변수로 전달받아서
	// 	console에 출력

	public void score(int intSum,float floatAvg) {
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
		

	}

	public void score() {
		System.out.println("매개변수 없음");
	}
	
	public void print(int intKor, int intEng, int intMath) {
		
		// 연산 , 계산부분을 처리
		// 출력부분처리
		
		System.out.println("========================================");
		System.out.println("국어\t영어\t수학\t 총점\t 평균");
		System.out.println("----------------------------------------");
		
		System.out.print(intKor +"\t");
		System.out.print(intEng +"\t");
		System.out.print(intMath +"\t");
		
		int num = intKor+intEng+intMath;
		float fAvg = (float) num / 3;
		
		System.out.print(num + "\t");
		System.out.println(fAvg);
		System.out.println("========================================");
		
		
	}

}
