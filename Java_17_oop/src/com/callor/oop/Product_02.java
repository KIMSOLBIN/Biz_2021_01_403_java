package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {

	public static void main(String[] args) {
		
		// VO 클래스를 배열로 선언하고 사용(데이터 저자,읽기)하려면
		// 선언된 객체배열 요소요소를 모두 다시 초기화(생성)하는 과정이 필요하다.
		
		//이 과장이 생략되면 이후 코드에서 NullpinterException이 발생한다.

		ProductVO[] pVO = new ProductVO[5];

		Scanner scan = new Scanner(System.in);

		// pVO[0] = new ProductVO();
		// pVO[1] = new ProductVO();
		// pVO[2] = new ProductVO();
		// pVO[3] = new ProductVO();
		// pVO[4] = new ProductVO();

		// 위에 배열은 for문을 쓰지 않았을때 풀어쓴 경우이다.
		for (int i = 0; i < pVO.length; i++) { // for문을 이용하여 5개의 배열을 반복하게 해준다.
			pVO[i] = new ProductVO();
		}

		for (int i = 0; i < pVO.length; i++) {
			System.out.println("=============================");
			System.out.println("상품정보 등록(입력) 시스템 V2");
			System.out.println("-----------------------------");
			System.out.println("상품정보를 입력하세요.");
			System.out.println("-----------------------------");

			System.out.print("상품코드 입력 >>");
			pVO[i].strPCode = scan.nextLine();

			System.out.print("상품명 입력 >>");
			pVO[i].strPName = scan.nextLine();

			System.out.print("품목 입력 >>");
			pVO[i].strItem = scan.nextLine();

			System.out.print("거래처 입력>>");
			pVO[i].strDName = scan.nextLine();

			System.out.print("매입단가 입력 >>");
			pVO[i].iPrice = Integer.valueOf(scan.nextLine());

			System.out.print("매출단가 입력 >>");
			pVO[i].oPrice = Integer.valueOf(scan.nextLine());

			pVO.toString();

		}
	}
}
