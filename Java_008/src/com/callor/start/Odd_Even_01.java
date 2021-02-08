package com.callor.start;

public class Odd_Even_01 {

	public static void main(String[] args) {
		
		int intSum1 = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			
			boolean bYes = (i + 1) % 2 == 0;
			
			// 만약 bYes가 true이면  
			if(bYes) {
				// 값을 변수에 계속 더하라
				intSum1 += i + 1;
						
				
			}
			
		}
		
		// 결과값을 출력하라
				System.out.println("1~100까지의 짝수의합" + intSum1);
				
				
				int intSum2 = 0;
				
				for(int i = 1 ; i < 100 ; i++) {
					
					boolean bYes = i % 2 == 1;
					
					if(bYes) {
						intSum2 += i;
								
						
					}
					
				}
			
						System.out.println("1~100까지의 홀수의합" + intSum2);
						
						
						// 위에서 선언하고 사용했던 변수를 "재 사용"하기
						// 반드시 초기화(clear) 해야 한다.
						int intSumOdd = 0;
						for(int i = 0 ; i < 100 ; i++) {
							int num = i + 1;
							boolean bYes = num % 2 == 0;
							
							// if( bYes == false) {
							
							// bYes가 true가 아니면
							if( !bYes ) {
								intSumOdd += num;	
							}
						}
						System.out.println("홀수의합 : " + intSumOdd);
						
	}

}
