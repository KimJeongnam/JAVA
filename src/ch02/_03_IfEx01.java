package ch02;

import java.util.Scanner;

public class _03_IfEx01 {
	public static void main(String[] args) {
		// 값을 입력받은 후 짝수/홀수/0
		
		
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.println("값을 입력하시오");
		number = input.nextInt();
		
		if (number == 0 ) {
			System.out.println("0입니다.");
		} else if (number %2 == 0) {
			System.out.println("짝수입니다.");
			
		} else {
			System.out.println("홀수입니다.");
		}
		input.close();	
	}

}
