package com.callor.start.jdk;

/*
 * for(int i = 0 ; i < 100 ; i ++)
 * Random 클래스 이용
 * 
 * 1 ~ 100까지 범위에 임의의 숫자 100개를 만들고
 * 100개 중에 짝수가 있으면 짝수들의 합을 계산
 * 
 */

import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			
			int num1 = rnd.nextInt(100) + 1;
			
			if(num1 % 2 == 0) {
				//num가 짝수이면 실행되는 부분
				//num값을 다른 변수(sum)에 누적
				sum += num1; // sum = sum + num1
				System.out.println("1~100까지의 짝수 : " + num1);
				
				
			}else {
				System.out.println("1~100까지의 홀수 : " + num1);
			}
		}// for end
		System.out.println("짝수의 합" +sum);
	}

}
