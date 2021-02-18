package com.callor.applications.service;

public class ClassServiceV7 {
	/*
	 * 정수 1개를 매개변수 dan에 전달받아 구구단 출력
	 */

	public void gugu(int dan) {


			System.out.println("=======================");
			System.out.printf("%d단 구구단\n", dan);
			System.out.println("-----------------------");

			if (dan > 1 && dan < 10) {

				for (int n = 2; n < 10; n++) {

					System.out.println(dan + "X" + n + "=" + dan * n);
				}

			} else {
				System.out.println("2~9까지의 정수 입력하세요");
		}

	}

}
