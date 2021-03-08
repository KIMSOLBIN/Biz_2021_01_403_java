package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.callor.score.model.ScoreVO;
import com.callor.score.service.CartService;

public class CartServiceImplV1 implements CartService {

	private List<Integer> cartList;
	private String fileName;

	public CartServiceImplV1() {

		fileName = "src/com/callor/score/nums.txt";
		cartList = new ArrayList<Integer>();

	}

	@Override
	public void makeScore() {

		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			cartList.add(num);
		}

	}

	public void saveScoreToFile() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			for (Integer n : cartList) {
				printer.print(n);
			}

			int nSize = cartList.size();
			for (int i = 0; i < nSize; i++) {
				Integer n = cartList.get(i);
				printer.println(n);
			}

			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void loadScoreFromFile() {
		// TODO Auto-generated method stub

	}

}
