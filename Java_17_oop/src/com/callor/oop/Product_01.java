package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {
	
	public static void main(String[] args) {
		
		ProductVO pVO = new ProductVO();
		System.out.println("toString() : " + pVO.toString());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("상품정보 등록(입력) 시스쳄 V1");
		System.out.println("-----------------------------");
		System.out.println("상품정보를 입력하세요.");
		System.out.println("-----------------------------");
		
		System.out.print("상품코드 입력 >>");
		pVO.strPCode = scan.nextLine();
		
		System.out.print("상품명 입력 >>");
		pVO.strPName = scan.nextLine();
		
		System.out.print("품목 입력 >>");
		pVO.strItem = scan.nextLine();
		
		System.out.print("거래처 입력>>");
		pVO.strDName = scan.nextLine();
		
		System.out.print("매입단가 입력 >>");
		pVO.iPrice = scan.nextInt();
		
		System.out.print("매출단가 입력 >>");
		pVO.oPrice = scan.nextInt();
		
		pVO.toString();
	}

}
