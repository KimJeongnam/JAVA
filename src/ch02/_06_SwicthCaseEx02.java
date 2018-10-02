package ch02;

import java.util.Scanner;

public class _06_SwicthCaseEx02 {
	public static void main(String[] args) {
		int num;
		String result;
		Scanner input = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		num = input.nextInt();

		switch (num) {
		case 2:
		case 3:
		case 4:
			result = "두서넛";
			break;
		case 5:
		case 6:
			result = "대여섯";
			break;

		default:
			result = "이외 의 수";
			break;
		}
		System.out.println(result);
		
		input.close();
	}
}
