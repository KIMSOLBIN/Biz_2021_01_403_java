package com.callor.student;

import com.callor.student.serivce.StudentService;
import com.callor.student.serivce.impl.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentService stService = new StudentServiceImplV1();
		
		stService.loadDataFromFile();
		stService.searchStudent();
	}

}
