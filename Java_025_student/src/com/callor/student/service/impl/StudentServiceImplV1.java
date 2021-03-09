package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.Values.ValStudent;
import com.callor.student.Values.Values;
import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	List<StudentVO> student;
	private Scanner scan;

	public StudentServiceImplV1() {
		// TODO Auto-generated constructor stub
		student = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void loadDataFromFile() {

		String fileName = "src/com/callor/student/학생정보리스트.txt";

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

				String[] stDatas = reader.split(":");

				StudentVO studentVO = new StudentVO(stDatas[ValStudent.ST_NUM], 
						(stDatas[ValStudent.ST_NAME]),
						(stDatas[ValStudent.ST_SUB]), 
						(stDatas[ValStudent.ST_ADDRESS]), 
						(stDatas[ValStudent.ST_PNUM]),
						Integer.valueOf(stDatas[ValStudent.ST_GRADE]), 
						Integer.valueOf(stDatas[ValStudent.ST_CLASS]));
				student.add(studentVO);

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을동안 문제 발생");
		}

	}

	@Override
	public Integer selectMenu() {

		while (true) {

			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력");
			System.out.println(Values.sLine(50));
			System.out.print("이름 >>");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				break;
			}

			for (StudentVO st : student) {

				strName = scan.nextLine();
				System.out.println("이름 : \t" + st.getStName() + "\n");
				System.out.println("학과 : \t" + st.getStSub() + "\n");
				System.out.println("학년 : \t" + st.getStGrade() + "\n");
				System.out.println("반 : \t" + st.getStClass() + "\n");
				System.out.println("주소 : \t" + st.getStAddress() + "\n");
				System.out.println("전화번호 : \t" + st.getStPNum() + "\n");
				System.out.println(Values.dLine(50));

			}

			try {
				Integer intName = Integer.valueOf(strName);

				if (intName == null) {
					System.out.println("데이터가 없습니다");
				} else {
					System.out.println(Values.dLine(70));
					System.out.println(strName + "자료는 없습니다");
					System.out.println(Values.dLine(70));
					
					break;
				}
			} catch (Exception e) {

			}

		} // while end

		return null;
	}

	@Override
	public void inputData() {

	}

	@Override
	public void printStudent() {

	}

}
