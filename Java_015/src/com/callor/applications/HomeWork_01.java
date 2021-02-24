package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] num = new int[100];
		int i = 0;
		for (i = 0; i < num.length; i++) { // int[] num에 들어간 100개을 배열하면 0~99이므로
			num[i] = rnd.nextInt(100) + 1; // Random 코드를 이용하여 rnd.nextInt에 (100)+ 1을 더하여 1 ~ 100이라는 숫자를 만들어준다.
		}
		PrimeServiceV2 ccV2 = new PrimeServiceV2();

		// 이 변수는 for() 반복문에서 수행한 연산
		// 덧셈을 수행한 후
		// 결과를 출력하는 곳에서 사용해야할 변수이다.
		// 따라서for() 반복문이 시작되기전에
		// 변수를 초기화해줘야한다.
		int sum = 0;
		for (i = 0; i < num.length; i++) {
			int result = ccV2.prime(num[i]); // 위 Random을 이용한 값을 PrimeserviceV2파일에 넘겨 대입한다
											// PrimeservieV2에는 return코드가 사용 되어있으므로 "int result"를 이용하여 계산결과값을 불러온다.

			//소수 리스트 출력
			if (result > 0) { // result에 들어간 PrimeserviceV2의 계산결과로 소수이면 숫자 그대로 출력 또는 소수가 아니면 -1 이라는 값이 result에 저장
				System.out.println(result); // if문에 들어간 조건이 참이면 출력문에 result를 넣게 되면 소수인 숫자들이 출력됨
				sum += result;// 리스트에 나온 소수들의 합을 구하기 위해 계속 더해준다는 "+="을 하여 소수들을 더해준다.
			}
		} // end for

		System.out.println("소수의 합 :" + sum); // 소수의 합의 결과는 한번만 나와야 하기 때문에
												 // for(반복문){} 밖에 출력해야한다.
												 //  만약에 for(반복문)에 {}안에 출력한다면 값을 무한 반복출력하게 된다.
	}
}
