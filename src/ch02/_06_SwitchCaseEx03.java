package ch02;

import java.util.Scanner;

public class _06_SwitchCaseEx03 {
	public static void main(String[] args) {
		int jumsu;
		char grade = ' ';
		String result = "합격";

		Scanner input = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		jumsu = input.nextInt();

		if (!(jumsu <= 100 && jumsu >= 0)) {
			System.out.println("0~100 사이의 점수를 입력해주세요.");
		} else {
			switch (jumsu / 10) {
			case 6:
				grade = 'D';
				break;
			case 7:
				grade = 'C';
				break;
			case 8:
				grade = 'B';
				break;
			case 9:
			case 10:
				grade = 'A';
				break;
			default:
				grade = 'F';
				result = "불합격";
				break;
			}
			System.out.println("점수 는 " + jumsu + "학점 : " + grade + " " + result + "입니다.");
		}
		input.close();
		
		
	}
}
