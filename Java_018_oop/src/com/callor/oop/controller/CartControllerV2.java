package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {

		CartVO[] cartVO = new CartVO[3];
		
		cartVO[0] = new CartVO();
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartQty(10);
		
		System.out.println(cartVO[0].toString());
		
		cartVO[1] = new CartVO();
		cartVO[1].setCartUserName("이몽룡");
		cartVO[1].setCartPName("사과파이");
		cartVO[1].setCartPrice(2000);
		cartVO[1].setCartQty(10);
		
		System.out.println(cartVO[1].toString());
		
		
		cartVO[2] = new CartVO();
		cartVO[2].setCartUserName("성춘향");
		cartVO[2].setCartPName("딸기파이");
		cartVO[2].setCartPrice(1500);
		cartVO[2].setCartQty(10);
		
		System.out.println(cartVO[2].toString());
		
		
		// === cartVO의 개수가 3인 상태
				// 상품 한가지를 더 카트에 넣고 싶다
				cartVO = new CartVO[4];
				// 배열은 처음에 설정한 값외에는 기존에 있는 값을 유지하면서 추가되지 않는다.
				// 위에 0,1,2의 배열은 무시해버리고 cartVO[4]라는 새로운 배열이 생긴거다.
				// 그래서 현재 for문에 있는건 3이 만들어진거지 나머지 0,1,2는 안만들어진 상태이기때문에
				// NullpointerException 이라는 에러가 발생한것이다.
				
				cartVO[3] = new CartVO();
				cartVO[3].setCartUserName("홍길동");
				cartVO[3].setCartPName("바나나우유");
				
				System.out.println("========================");
				System.out.println("카드내용");
				System.out.println("--------------------------");
				for(int i = 0 ; i < cartVO.length ; i++) {
					System.out.println(cartVO[i].toString());
				}
				
		
		

	}

}
