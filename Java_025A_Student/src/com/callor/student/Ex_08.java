package com.callor.student;
/*
 * 정수향 배열 100개를 선언하여
 * 10 ~ 100까지 임의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수중에 소수들만 찾아서
 * Console 출력
 */
public class Ex_08 {
	
	public static void main(String[] args) {
		
		
		int[] num = new int[100];
		
		int sum = 0;
		for(int i = 10 ; i < num.length ; i++) {
			
			sum += num[i];
			
			if(sum %2 == 1) {
				System.out.println(sum);
			}else {
				System.out.println(sum);
			}
			
			
		}
		
		
		
	}
	


}
