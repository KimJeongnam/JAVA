package ch04;

import java.util.Scanner;

public class _09_Sungjuk {
	private int ko;
	private int en;
	private int math;
	private final int COUNT = 3;

	public _09_Sungjuk() {
		// TODO Auto-generated constructor stub
	}

	public _09_Sungjuk(int ko, int en, int math) {
		this.ko = ko;
		this.en = en;
		this.math = math;
	}

	public void print() {
		/*
		 * System.out.printf("국어 : "+ko +"\n영어 : "+en +"\n수학 : "+math
		 * +"\n총 합 : "+total() +"\n------- Result ---------" +"\n평균 : %2.2f"
		 * +"\n학점 : "+getGrade(), getAvg());
		 */

		System.out.printf("국어 : %d" 
				+ "\n영어 : %d" 
				+ "\n수학 : %d" 
				+ "\n총 합 : %d" 
				+ "\n------- Result ---------"
				+ "\n평균 : %2.2f" 
				+ "\n학점 : %c", getKo(), getEn(), getMath(), total(), getAvg(), getGrade());
	}

	private int total() {
		return this.ko + this.en + this.math;
	}

	private double getAvg() {
		return (double) total() / this.COUNT;
	}

	private char getGrade() {
		int avg = (int) getAvg();
		char grade = 'F';

		if (avg > 100 || avg < 0) {
			System.out.println("평균 오류!");
			return ' ';
		}

		switch (avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		}

		/*
		 * if(avg >=90) { grade = 'A'; }else if(avg >= 80) { grade = 'B'; }else if(avg
		 * >= 70) { grade = 'C'; }else if(avg >= 60) { grade = 'D'; }
		 */
		return grade;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		_09_Sungjuk sungjuk = new _09_Sungjuk();

		System.out.print("국어 입력 : ");
		sungjuk.setKo(input.nextInt());
		System.out.print("영어 입력 : ");
		sungjuk.setEn(input.nextInt());
		System.out.print("수학 입력 : ");
		sungjuk.setMath(input.nextInt());
		sungjuk.print();
		
		input.close();
	}
}
