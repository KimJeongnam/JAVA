package ch02;

import java.util.Scanner;


public class _09_DoWhileEx03 {
	public static void main(String[] args) {
		/*
		 * 문자 입력, 'q' OR 'Q' 입력받을시 종료
		 */
		char c = ' ';
		Scanner input = new Scanner(System.in);
		
		do {
			String buf;
			System.out.println("문자를 입력하세요 : ");
			buf = input.next();
			if(buf.length()!=1) {
				System.out.println("문자는 하나만 입력가능합니다.!!");
				continue;
			}
			c = buf.charAt(0);
			System.out.println(c);
		}while(!(c=='q' || c=='Q'));
		System.out.println("프로그램 종료!");
		input.close();
	}
}
