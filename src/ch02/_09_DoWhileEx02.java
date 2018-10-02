package ch02;

import java.util.Scanner;

public class _09_DoWhileEx02 {
	public static void main(String[] args) {
		/*
		 * month 입력 (1~12), 잘못된 월..
		 */
		
		int month = 0;
		Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.println("월 입력 : ");
			month = input.nextInt();
			System.out.println(month);
		}while(month>=1 && month<=12);
		System.out.println("잘못된 월입니다.");
		input.close();
	}
}
