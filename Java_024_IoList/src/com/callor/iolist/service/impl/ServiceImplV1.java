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
			
			while(true) {
				
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				
				String scores[] = reader.split(",");
				ScoreVO vo = new ScoreVO(scores[0], // strNum
						scores[1], 					// straccount
						scores[2],					// productName
						Integer.valueOf(scores[3]),// srot
						Integer.valueOf(scores[4]),// qty
						Integer.valueOf(scores[5]),// price
						Integer.valueOf(scores[6])); // sales
						
						scoreList.add(vo);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일이 없습니다");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일을 읽는동안 문제 발생!!");
		}
		this.printScore();

	}

	@Override
	public void PurchaseSales() {
		
		for(ScoreVO vo : scoreList) {
		
		}

	}

	@Override
	public void rankSet() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}
}