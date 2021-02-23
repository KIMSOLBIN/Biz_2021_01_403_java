package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		Random rnd = new Random();
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);

		/*
		 * 변수는 앞에서 어떤 값을 저장했던 상관없이 가장 마지막에 저장한 값만 가지고 있다
		 */

		int num = 0;
		num = 100;
		num = 101;
		num = -1;
		num = -10000; 						// 내려오면서 변수의 값은 전에 값이 아닌 마지막에 저장된 값만을 표시한다.
		System.out.println(num);			  // 전에 값은 사라진다.
		
		System.out.println("1 ~ 10까지 정수");
		System.out.print("숫자입력 >>");
		int KeyNum = scan.nextInt();

		int lastpos = 0;
		System.out.printf(" %d값의 마지막 위치번호\n", KeyNum);
		for (int f = 0; f < intNums.length; f++) {
			if (intNums[f] == KeyNum) {
				System.out.println(f); 

				// 키보드로 입력한 값이 일치할때마가
				// 그 위치를 lastpos에 저장한다.
				lastpos = f; 
				// 키보드로입력한 값의 저장된 값들은 for문(반복문)으로 인해
				// 위에 int num처럼 처음나온값이 나오면 다시 그 다음값을 출력하는
				// 방법을 반복하다 마지막으로 나온 값을 num  = -10000으로 되어있기때문에
				// lastpos를 출력시 마지막 숫자만 나온것도 마지막에 출력된 값만이 표시되기 때문에
				// 출력해서 마지막에 나온 숫자가 출력된것이다.
			}
		}
		// 여기 오면 lastpos에 저장된 값은
		// 가장 마지막으로 lastpos = f이 실행된 결과만 담고 있다
		System.out.print("마지막위치" + lastpos); 

	}

}
