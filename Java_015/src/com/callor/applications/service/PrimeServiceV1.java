package com.callor.applications.service;

import java.util.Scanner;

public class PrimeServiceV1 {

	// 정수 1개를 매개변수로 갖는 prime() method
	public void prime(int num) { // prime_02에 넣어진 코드들이 ccV1.prime(KeyNum);을 통해서 들어옴
								// ccV1.prime(KeyNum);에 들어가진 코드들이 들어가서
								// 밑에 계산과 조건에 대입되어 계산한다

		
		int pos = 0;
		for(pos = 2; pos < num ; pos++) {
			if(num % pos == 0) {
				break;
			}
		}

		System.out.println(pos);
		
		if(pos < num) {
			System.out.println(num + "는 소수가 아님");
		
		}else {
			System.out.println(num + "는 소수임");
		}
		
		
		
	}
}
