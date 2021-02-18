package com.callor.applications.service;

public class ClassServiceV1 {

	
	/*
	 * Java코딩을 할 때
	 * {} 내에서 같은 이름의 변수는 2번이상 선언불가
	 * class{} 내에서 같은 이름의 메서는 2번이상 선언불가
	 * 
	 * 하지만, java에서는
	 * 	메서드의 매개변수 개수, 타입이 다르면
	 * 	같은 이름의 메서드를 중복하여
	 * 	선언할수 있다
	 */
	public void add (int num1, int num2 ) {
		System.out.println(" 정수 숫자 2개의 덧셈");
		System.out.println( num1 + num2);
		
	}
	
	public void add (int intSum, float floatAvg) {
		System.out.println(" 정수와 실수의 덧셈");
		System.out.println(intSum + floatAvg);
	}
	
	public void add (double d,float fnum1) {
		System.out.println(" double실수와 flaot실수의 연산");
		System.out.println(d + fnum1);
		System.out.println(d - fnum1);
		System.out.println(d * fnum1);
		System.out.println(d / fnum1);
		
	}
	
	public void add() {
		System.out.println(" 매개변수 없음 ");
	}
	
	
}
