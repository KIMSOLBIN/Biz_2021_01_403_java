package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;

public class MenuServiceImplV1 implements MenuService {

	private Scanner scan;

	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("===================================");
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println("-----------------------------------");
			System.out.println("1. 학생성적 점수 생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println("===================================");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				break;
			}

			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("메뉴는 1 ~ 3까지 선택");
				}
			} catch (Exception e) {
				System.out.println("메뉴선택은 QUIT, " + "1 ~ 3까지 정수만 가능");
			}
		}

		return null;
	}

}
