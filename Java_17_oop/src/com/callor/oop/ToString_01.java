package com.callor.oop;

import java.util.Random;

public class ToString_01 {
	
	public static void main(String[] args) {
		
		int num = 30;
		System.out.println("num : " + num);
		
		Integer num1 = 30;
		System.out.println("num: " + num1.toString());
		
		Random rnd1 =  new Random();
		Random rnd2 =  new Random();
		Random rnd3 =  new Random();
		System.out.println(rnd1.toString()); //이 코드가 저장될 장소를 알려준다.
		System.out.println(rnd2.toString());
		System.out.println(rnd3.toString());
	
	}

}
