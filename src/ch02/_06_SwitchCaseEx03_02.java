package ch02;

import java.util.Scanner;

public class _06_SwitchCaseEx03_02 {
	public static void main(String[] args) {
		/*
		 * 
		 */
		int jumsu = 0;
		char grade = ' ';
		String result = "합격";
		String str = null;

		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력 하세요 : ");
		jumsu = input.nextInt();

		switch (jumsu / 10) {
		case 0:
			if (jumsu < 0) {
				str = "입력 오류 음수를 입력하셨습니다. 0보다 큰 수를 입력해 주세요.";
				break;
			}
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			grade = 'F';
			result = "불합격";
			break;
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
			if (jumsu != 100) {
				str = "점수오류  점수는 100을 초과 할 수 없습니다.";
				break;
			}
			grade = 'A';
			break;
		default:
			if(jumsu >0)
				str = "점수오류  점수는 100을 초과 할 수 없습니다.";
			else
				str = "입력 오류 음수를 입력하셨습니다. 0보다 큰 수를 입력해 주세요.";
			break;
		}
		if (str == null)
			System.out.println("당신의 점수는 " + jumsu + "이며 " + result + "(" + grade + ") 입니다.");
		else
			System.out.println(str);
		
		input.close();
	}
}
