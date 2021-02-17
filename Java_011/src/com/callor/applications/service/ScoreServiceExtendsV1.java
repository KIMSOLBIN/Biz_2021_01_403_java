package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스의 extends(확장, 상속)
 * 
 * ScoreServiceV4 : parent(부모) 클래스
 * ScoreServiceExtendsV1 : child(자식) 클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의된 모든 method를
 * 		코드한줄 추가, 수정 없이 그대로 사용할수 있다
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 method와
 * 		새롭게 추가된 method가 있는
 * 		확장된 클래스의 생성
 * 
 */
public class ScoreServiceExtendsV1 extends ScoreServiceV4 {
	
	// public void 메인이름 ()는  나중에 현재 class 파일에 있는 내용 선언을 하여
	// { } 안에 주어진 조건을 다른 파일에 이행시 {}의 조건으로 결과를 내는것을 말한다.
	
	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */
	
	// reture이라는 코드가 사용될려면 void가 아닌 int로 사용해야함.
	public int input(String subject) {
		
		// Scanner는 정수,실수,문자열을 읽어올 수 있는 클래스이다
		// Scanner을 활성화하기 위해서는 
		// ctrl + shift + O(영문 O)를 눌러 package와 public void 사이에 import java.util.Scanner이 나오는지 확인
		// 또는 ctrl + space바로 자동완성도 가능
		
		//System.in은 입력한 값을 바이트 단위로 읽는 것을 뜻하는데
		Scanner scan = new Scanner(System.in);
		
		// int는 intScore이라는 단어에 0이란 숫자로 
		// 이 단어에 들어갈 조건이나 결과값을 넣기 위한 빈그릇을 만들기 위한 코드이다
		int intScore = 0;
		
		// while은 무한반복문으로 while {}(괄호) 안에 들어간 조건의 값을 무한반복으로 결과를 보여주는 코드이다.
		//		()에 넣은 조건은 참,거짓만 사용하지 않고 10보다 작은 수만을 찾는다라면 (num(입력한값) < 10) 등으로로 가능하다
		// while은 예를 들어 참(true)와 거짓(false) 등 조건에 넣는다면 그 조건에 해당하는 값의 결과만을 만드는데
		// while의 ()가 참(ture)일 경우에 {}(괄호)안에 ture로 나오는 값만을 결과로 표시하고 그 결과값을 무한반복 표시한다.
		while(true) {
			
			// System.out.println();에 입력할 값이 어떤 값인지 알기 위해 문구를 넣고
			// intScore에  intScore = scan.nextInt(); 이라는 문자를 넣어 
			// 그 결과에 값을 넣을수 있는 Scanner코드를 넣는 선언을 한다
			
			// intScore = scan.nextInt();에 nextInt는 Int로 반환한다는 뜻이다.
			System.out.println(subject + "점수 입력 >>");
			intScore = scan.nextInt();
			
			// if는 "만약에" 라는 코드로
			// '만약 if() 괄호안에 주어진 조건이라면...'
			// {} (괄호)안에 주어진 값이 if()가 제시한 조건이 아니라면
			// else라는 "다른" 이라는 단어를 넣어
			// if()가 주어진 조건과 '다른'(else)라면 else { }에 넣어진 조건에 결과가 나오도록한다.
			
			if(intScore < 0 || intScore > 100) {
				System.out.println(subject + " 점수는 0 ~ 100 까지 입력");
			} else {
				break;
			
			if(intScore < 0) {
				System.out.println(subject + "점수는 0점 이상입력!!");
			}else if (intScore > 100) {
				System.out.println(subject +"점수는 100점 이하 입력!!");
			}else {
				break;
			}
		}
		// System.out.println("입력한 점수 : " + intScore);
		
		return intScore;
		// reture intScore에 담아져 있는 변수를 담아라
		
		// 호출한 코드에서
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라

		
	}

}
