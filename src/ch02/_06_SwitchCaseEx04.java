package ch02;

import java.util.Scanner;

public class _06_SwitchCaseEx04 {
	/*
	 * 3~5 봄 6~8 여름 9~11 가을 12~2 겨울
	 * 
	 * 유효 1~12
	 */
	public static void main(String[] args) {
		int month;
		String result = null;

		Scanner input = new Scanner(System.in);

		System.out.println("Month 를 입력 하세요 : ");
		month = input.nextInt();

		if (month <= 12 && month >= 1) {
			switch (month) {
			case 3:
			case 4:
			case 5:
				result = "봄";
				break;
			case 6:
			case 7:
			case 8:
				result = "여름";
				break;
			case 9:
			case 10:
			case 11:
				result = "가을";
				break;
			default:
				result = "겨울";
				break;
			}
			System.out.println("'"+result+"' 입니다.");
		}else 
			System.out.println("Error! 1~12 사이의 숫자를 입력해주세요.");
		
		input.close();
	}

}
