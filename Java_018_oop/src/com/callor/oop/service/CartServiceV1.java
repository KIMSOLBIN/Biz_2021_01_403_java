package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

/**
 * @author SpringMVC
 *
 */
public class CartServiceV1 {

	private List<CartVO> cartList = new ArrayList<CartVO>();	

	public void intputCart() {

		Scanner scan = new Scanner(System.in);


		for (int i = 0; i < 3; i++) {

			// 제목보이기
			System.out.println("===================");
			System.out.println("쇼핑카트 상품추가");
			System.out.println("-------------------");

			// 입력받기

			System.out.println("구매자>>");
			String strUserName = scan.nextLine();

			System.out.println("상품명>>");
			String strPName = scan.nextLine();

			
			int intQty = 0;
			while (true) {
				System.out.println("수량 >>");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);
					if (intQty < 2) {
						System.out.println("수량은 1이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로 입력하세요.");
				}
				break;
			}

			int intPrice = 0;
			while (true) {
				System.out.println("단가 >>");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1000) {
						System.out.println("단가는 1000이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("단가는 숫자로 입력하세요.");
				}
				break;

			}

			// 카트정보 생성
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);
			cartVO.setCartPrice(intPrice);
			cartVO.setCartQty(intQty);

			// 카트정보 리스트에 추가하기
			cartList.add(cartVO);
		} // end for

	}
	
	public void PrintCartList() {
		
		System.out.println("===================");
		System.out.println("구매자\t상품명\t단가\t수량\n");
		System.out.println("-------------------");

		int nSize = cartList.size();
		for (int i1 = 0; i1 < nSize; i1++) {
			System.out.printf("%s\t%s\t%d\t%d\n", cartList.get(i1).getCartUserName(), cartList.get(i1).getCartPName(),
					cartList.get(i1).getCartPrice(), cartList.get(i1).getCartQty());

		}
		System.out.println("================================");

	}
	
	
}

