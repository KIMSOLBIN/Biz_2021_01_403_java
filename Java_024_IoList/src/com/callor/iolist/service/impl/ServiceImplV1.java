package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.model.ScoreVO;
import com.callor.iolist.service.IoListService;

public class ServiceImplV1 implements IoListService {

	private String fileName;

	private List<ScoreVO> scoreList;

	public ServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/iolist/애입매출데이터.txt";
	}

	@Override
	public void inputScore() {
		Scanner scan = new Scanner(System.in);
	}

	@Override
	public void loadScoreFormFile() {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				String scores[] = reader.split(",");
				ScoreVO vo = new ScoreVO(scores[0], // strNum
						scores[1], // straccount
						scores[2], // productName
						Integer.valueOf(scores[3]), // srot
						Integer.valueOf(scores[4]), // qty
						Integer.valueOf(scores[5]), // price
						Integer.valueOf(scores[6])); // sales

				scoreList.add(vo);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일이 없습니다");
			// e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는동안 문제 발생!!");
		}
		this.printScore();

	}

	@Override
	public void PurchaseSales() {

		for (ScoreVO vo : scoreList) {

			int sum = vo.getPrice() * vo.getQty();

			vo.setSales(sum);

			if (vo.getSrot() == 1) {

				int sum1 = vo.getPrice() * vo.getQty();

				vo.setPrice(sum);
				vo.setSales(0);

			}
			
			if(vo.getSrot() == 2) {
				
			}

		}
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

		this.PurchaseSales();

		System.out.println("============================");
		System.out.println("매입매출정보");
		System.out.println("----------------------------");
		System.out.println("거래일자\t거래처\t대표자명\t" + "구분\t매입금액\t판매금액");
		System.out.println("===========================================================");

		for (ScoreVO vo : scoreList) {

			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStraccount() + "\t");
			System.out.print(vo.getProductName() + "\t");
			System.out.print(vo.getSrot() + "\t");
			System.out.print(vo.getQty() + "\t");
			System.out.print(vo.getPrice() + "\t");
			System.out.print(vo.getSales() + "\n");

			System.out.println("=======================================================");

		}

	}
}