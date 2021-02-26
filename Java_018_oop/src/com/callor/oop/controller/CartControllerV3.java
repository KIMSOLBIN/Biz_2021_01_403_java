package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {

		List<CartVO> cartList = new ArrayList<CartVO>();

		CartVO cartVO = new CartVO();

		Scanner scan = new Scanner(System.in);
		System.out.println("===========");
		System.out.println("장바구니");
		System.out.println("-----------");
		
		System.out.println("구매자>>");
		String userName = scan.nextLine();
		
		System.out.println("상품>>");
		String pName = scan.nextLine();
		
		System.out.println("가격>>");
		
		// 3000 이라고 입력하면 "3000"으로 입력되어 문자열이다
		String price = scan.nextLine();
		// " 3000" 문자열형 숫자를 정수 3000으로 변경하여 intprice 변수에 저장
		int intprice = Integer.valueOf(price);
		

		String strpName = "홍길동";
		
		cartVO.setCartUserName(userName);
		cartVO.setCartPName(pName);
		cartVO.setCartPrice(intprice);

		cartList.add(cartVO);
		cartList.add(cartVO);
		cartList.add(cartVO);


		for (int i = 0; i < 3; i++) {

			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n", cartVO.getCartPName(), cartVO.getCartPName(), cartVO.getCartQty(),
					cartVO.getCartPrice());

		}
	}
}
