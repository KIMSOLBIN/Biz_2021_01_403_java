package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03 {

	public static void main(String[] args) {

		ProductVO[] pVO = new ProductVO[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < pVO.length; i++) {
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
			if(pVO[i].iPrice < 0) {
				System.out.println("잘못된코드입니다");
				break;
			}

			System.out.print("매출단가 입력 >>");
			pVO[i].oPrice = Integer.valueOf(scan.nextLine());
			if(pVO[i].oPrice < 0) {
				System.out.println("잘못된코드입니다");
				break;
			}
			
			pVO.toString();
			
			
		}
	}
}
