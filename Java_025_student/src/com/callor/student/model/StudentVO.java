package com.callor.student.model;

/*
 * 학번      stNum 
 * 학생이름  stName
 * 학과      stSub
 * 학년      stGrade
 * 반        stClass
 * 주소      stAddress
 * 전화번호  stPNum
 */
public class StudentVO {

	private String stNum;
	private String stName;
	private String stSub;
	private String stAddress;
	private String stPNum;

	private int stGrade;
	private int stClass;
	
	
	
	public StudentVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public StudentVO(String stName, String stSub, String stAddress, String stPNum, int stGrade, int stClass) {
		super();
		this.stName = stName;
		this.stSub = stSub;
		this.stAddress = stAddress;
		this.stPNum = stPNum;
		this.stGrade = stGrade;
		this.stClass = stClass;
	}





	// 전체
	public StudentVO(String stNum, String stName, String stSub, String stAddress, String stPNum, int stGrade,
			int stClass) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stSub = stSub;
		this.stAddress = stAddress;
		this.stPNum = stPNum;
		this.stGrade = stGrade;
		this.stClass = stClass;
	}



	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStSub() {
		return stSub;
	}
	public void setStSub(String stSub) {
		this.stSub = stSub;
	}
	public String getStAddress() {
		return stAddress;
	}
	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}
	public String getStPNum() {
		return stPNum;
	}
	public void setStPNum(String stPNum) {
		this.stPNum = stPNum;
	}
	public int getStGrade() {
		return stGrade;
	}
	public void setStGrade(int stGrade) {
		this.stGrade = stGrade;
	}
	public int getStClass() {
		return stClass;
	}
	public void setStClass(int stClass) {
		this.stClass = stClass;
	}
	
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stSub=" + stSub + ", stAddress=" + stAddress
				+ ", stPNum=" + stPNum + ", stGrade=" + stGrade + ", stClass=" + stClass + "]";
	}

	
	


}
