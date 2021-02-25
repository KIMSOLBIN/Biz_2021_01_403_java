package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_021 {

	public static void main(String[] args) {

		ProductVO[] pVO = new ProductVO[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < pVO.length; i++) { 
			pVO[i] = new ProductVO();
		}
		
		System.out.println("=============================");
		System.out.println("상품정보 등록(입력) 시스템 V2");
		System.out.println("-----------------------------");
		System.out.println("상품정보를 입력하세요.");
		System.out.println("-----------------------------");

		String strN = 3 + ""; // "3"이라는 문자열로 저장
		int intN = Integer.valueOf(strN);
		
		for (int i = 0; i < pVO.length; i++) { 
			
			//연속된 값으로 상품코드 생성
			String PCode = ( i + 1) + "";
			pVO[i].strPCode = PCode;
			
			System.out.print("상품코드 입력 >>");
			pVO[i].strPCode = scan.nextLine();

			System.out.print("상품명 입력 >>");
			pVO[i].strPName = scan.nextLine();

			System.out.print("품목 입력 >>");
			pVO[i].strItem = scan.nextLine();

			System.out.print("거래처 입력>>");
			pVO[i].strDName = scan.nextLine();

			System.out.print("매입단가 입력 >>");
			String iPrice = scan.nextLine();
			pVO[i].iPrice = Integer.valueOf(iPrice);

			System.out.print("매출단가 입력 >>");
			String oPrice = scan.nextLine();
			pVO[i].oPrice = Integer.valueOf(oPrice);
			
			pVO[i].toString();
			
		}
	}
}
