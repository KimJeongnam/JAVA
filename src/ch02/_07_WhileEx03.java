package ch02;

import java.util.Scanner;

public class _07_WhileEx03 {
	public static void main(String[] args) {
		/*
		 * 출력할 구구단 단 입력
		 */
		int dan = 0;
		int i=1;
		
		Scanner input = new Scanner(System.in);

		System.out.print("출력할 단을 입력하세요 : ");
		dan = input.nextInt();
		
		while(i<10) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		input.close();
	}
}
