package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartServiceV1;

public class CartControllerV6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<CartVO> cartList = new ArrayList<CartVO>();
		
		CartServiceV1 csV1 =  new CartServiceV1();
		csV1.intputCart();
		csV1.PrintCartList();
		
	}
}
