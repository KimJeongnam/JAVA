package ch02;

import java.util.Scanner;

public class _05_IfEx01 {
	public static void main(String[] args) {
		int score = 0;
		char c = ' ';
		String str = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		score = input.nextInt();
		
		if(score >=90 && score<=100) {
			c = 'A';
			str = "합격";
		}else if(score>=80 && score<=89) {
			c = 'B';
			str = "합격";
		}else if(score>=70 && score<=70) {
			c = 'C';
			str = "합격";
		}else if(score>=60 && score<=69) {
			c = 'D';
			str = "합격";
		}else if(score>=0 && score<= 59) {
			c = 'F';
			str = "불합격";
		}else {
			System.out.println("점수 입력 에러 !! 100~0사이의 점수를 입력하세요.");
		}
		
		System.out.println("당신의 점수는 : "+score+" 이며 "+c+"학점 이므로 "+str+"입니다.");
		input.close();
	}
}
