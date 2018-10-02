package ch05;

import java.util.ArrayList;

public class _10_School {
	//정적 변수
	private static ArrayList<_10_School> schools_list = new ArrayList<_10_School>();
	// 맴버 변수
	private String schoolName;
	private String studentNumber;
	private String name;
	private int grade;
	
	public _10_School() {}
	
	public _10_School(String schoolName, String studentNumber, String name, int grade) {
		this.schoolName = schoolName;
		this.studentNumber = studentNumber;
		this.name = name;
		this.grade = grade;
	}
	
	// 맴버 메소드
	public String getSchoolName() {
		return schoolName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public String getName() {
		return name;
	}
	public int getGarde() {
		return grade;
	}
	
	// 정적 메소드
	public static ArrayList<_10_School> getSchools(){ return schools_list; }
	
	public static void print_ScoreOrGpa(_10_getHandler handler) {
		System.out.print("성적 구하기\n");
		
		if(_10_MidSchool.class.isInstance(handler)) {
			_10_MidSchool middle = (_10_MidSchool)handler;
			System.out.print(middle.getSchoolName()+" score : ");
		}
		else if( handler instanceof _10_College) {
			_10_College college = (_10_College)handler;
			System.out.print(college.getSchoolName()+" Gpa : ");
		}
		
		System.out.println(handler.getGrade_Gpa());
	}
	
	
	
/*
	public void getMiddleTest() {
		System.out.print("MiddleSchool 성적  구하기");
	}
	
	public void getColTest() {
		System.out.println("대학교 성적 구하기");
	}*/
	
	@Override
	public String toString() {
		return "_10_School [schoolName=" + schoolName + ", studentNumber=" + studentNumber + ", name=" + name
				+ ", grade=" + grade + ", getSchoolName()=" + getSchoolName() + ", getStudentNumber()="
				+ getStudentNumber() + ", getName()=" + getName() + ", getGarde()=" + getGarde() + "]";
	}
}
