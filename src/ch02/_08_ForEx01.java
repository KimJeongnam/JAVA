package ch02;

import java.util.Scanner;

public class _08_ForEx01 {
	public static void main(String[] args) {
		int dan;
		
		Scanner input = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		dan = input.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		input.close();
	}
}
