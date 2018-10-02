package ch02;

import java.util.Scanner;

public class _07_WhileEx05 {
	public static void main(String[] args) {
		/*
		 * 평균 구하기
		 * 음수를 임력하면 반복 루프를 종료
		 */
		
		Scanner input = PublicScanner.getScanner();
		int cnt = 1, score = 0, total = 0;
		
		
		/*while(true) {
			System.out.print("("+(cnt+1)+")점수를 입력하세요 : ");
			score = input.nextInt();
			if(score<0)break;
			total += score;
			cnt++;
		}*/
		
		do {
			cnt++;
			total += score;
			System.out.print("("+(cnt)+")점수를 입력하세요 : ");
			score = input.nextInt();
		}while(!(score<0));
		cnt -=1;
		
		System.out.println("total : "+total);
		System.out.println("cnt : "+cnt);
		System.out.println("평균 : "+total/cnt);
		
	}
}
