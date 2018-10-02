package ch02;

import java.util.Scanner;

public class _01_IfEx02 {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오: ");
		num = input.nextInt();
		if (num > 0) {
			System.out.println("양수입니다.");}
		else { System.out.println("음수입니다.");
		}
		
		input.close();
	}
}
