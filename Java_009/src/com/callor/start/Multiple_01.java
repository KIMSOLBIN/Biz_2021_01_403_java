package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {
		
		int intSum = 0;
		
		// 1 ~ 100까지의 범위에서 찾아
		for(int i = 0 ; i < 100 ; i++ ) {
			
			int num1 = i + 1;
			
			boolean bYes1 = num1 % 3 == 0;
			boolean bYes2 = num1 % 9 == 0;
			
			// 3의 배수이면서 (and) 9의배수
			if(bYes1 && bYes2) {
				
				intSum += num1; // i를 더하지 않는다
				System.out.println(num1 + "는 3과9의 배수");
			}
			
				
			
		}

		System.out.println("3의 배수 와 9의 배수의 합 : " + intSum);
		System.out.println("=======================================");
		
		intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;
			
			// if() 비교연산문을 중복 처리하는 방식
			
			if(bYes3M) { //3의 배수를 검사하고 맞으면
				// 연산을 수행한 후
				if(bYes9M) { // 다시 9의 배수를 검사
					intSum += num1;
					System.out.println(num1);
				}
			}
		}
		System.out.println(intSum);
		
	}

}
