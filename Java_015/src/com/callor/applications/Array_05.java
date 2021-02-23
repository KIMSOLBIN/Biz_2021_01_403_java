package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		Random rnd = new Random();
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
			// System.out.println(intNums[i]);
		}
		int sum = 0;
		for (int index = 0; index < intNums.length; index++) {

			if (intNums[index] % 3 == 0 && intNums[index] % 5 == 0) {

				System.out.println(intNums[index]);

				sum += intNums[index]; 

			}

		}
		System.out.println("3의배수와 5의배수 합" + sum);
		

	}

}
