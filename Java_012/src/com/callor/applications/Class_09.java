package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {
	
	public static void main(String[] args) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" 2 ~ 9 까지 중 정수 1개 입력하시오 >>");
		
		int dan = scan.nextInt();
		
		csV7.gugu(dan);
		
	}

}
