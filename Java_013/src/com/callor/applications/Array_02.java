package com.callor.applications;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNum = new int[10];

		int Sum = 0;

		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;

		}

		int intSum = 0;

		for (int i = 0; i < 10; i++) {

			Sum += intNum[i];
		}
		System.out.println("전체합 :" + intSum);

		int intSum2 = 0;
		for (int i = 0; i < 10; i++) {

			if (intNum[i] % 2 == 0) {

				intSum2 += intNum[i];
				
				System.out.println("짝수의 합 : " + intSum2);

			}

		}

	}

}
