package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] num = new int[100];
		int i = 0;
		for (i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100) + 1;
		}
		PrimeServiceV2 ccV2 = new PrimeServiceV2();

		int sum = 0;
		for (i = 0; i < num.length; i++) {
			int result = ccV2.prime(num[i]);

			if (result > 0) {
				System.out.println(result);
				sum += result;
			}
		}

		System.out.println("소수의 합 :" + sum);
	}
}
