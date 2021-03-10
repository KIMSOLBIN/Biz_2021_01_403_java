package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	private String fileName;

	private List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		this("src/com/callor/score/data/score.txt");
	}

	public ScoreServiceImplV1(String fileName) {
		scoreList = new ArrayList<ScoreVO>();
		this.fileName = fileName;
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

	}

	@Override
	public void makeScore() {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		ScoreVO scoreVO = new ScoreVO();

		while (true) {

			System.out.println("학번을 입력하세요");
			int intNum = scan.nextInt();
			scoreVO.setStNum(intNum);

			System.out.println("국어점수 입력 >>");
			int intKor = scan.nextInt();
			scoreVO.setKor(intKor);
			if (intKor < 0 && intKor > 100) {
				System.out.println("0 ~ 100까지의 숫자만 입력하시오.");
			}

			System.out.println("영어점수 입력 >>");
			int intEng = scan.nextInt();
			scoreVO.setEng(intEng);
			if (intEng < 0 && intEng > 100) {
				System.out.println("0 ~ 100까지의 숫자만 입력하시오.");
			}

			System.out.println("수학점수 입력 >>");
			int intMath = scan.nextInt();
			scoreVO.setMath(intMath);
			if (intMath < 0 && intMath > 100) {
				System.out.println("0 ~ 100까지의 숫자만 입력하시오.");
			}

			int intMusic = 0;
			System.out.println("음악점수 입력 >>");
			intMusic = scan.nextInt();
			scoreVO.setMusic(intMusic);
			if (intMusic < 0 && intMusic > 100) {
				System.out.println("0 ~ 100까지의 숫자만 입력하시오.");
			}

			scoreList.add(scoreVO);

			break;
		}
	}

	@Override
	public void saveScoreFile() {

		this.saveScoreFile("src/com/callor/score/data/score.txt");

	}

	public void saveScoreFile(String fileName) {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int nCount = 0;
			for (ScoreVO sVO : scoreList) {
				printer.print(sVO + ":");
				if (++nCount % 6 == 0) {
					printer.println();
				}
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

		scoreList.removeAll(scoreList);

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

				String scores[] = reader.split(":");
				ScoreVO vo = new ScoreVO(Integer.valueOf(scores[0]),
						Integer.valueOf(scores[1]),
						Integer.valueOf(scores[2]), 
						Integer.valueOf(scores[3]),
						Integer.valueOf(scores[4]));

				scoreList.add(vo);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다.");
		}
		// TODO Auto-generated method stub
		catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는동안 문제 발생");
		}
		this.printScore();

	}

	@Override
	public void totalAndAvg() {
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();

			float avg = (float) sum / 4;

			vo.setTotal(sum);
			vo.setAvg(avg);
		}

	}

	@Override
	public void printScore() {

		this.totalAndAvg();

		System.out.println("=============================================");
		System.out.println("성적알림표");
		System.out.println("=============================================");
		System.out.println("학번\t국어\t영어\t수학\t" + "음악\t총점\t퍙균");
		System.out.println("---------------------------------------------");

		for (ScoreVO vo : scoreList) {

			System.out.print(vo.getStNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");

			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\t", vo.getAvg());
			System.out.println("------------------------------------------");

			System.out.println("총점:");
			System.out.println("평균:");
			System.out.println("==========================================");

		}

	}

}
