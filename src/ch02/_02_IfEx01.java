package ch02;

import java.util.Scanner;

public class _02_IfEx01 {

	/*
	 * 1. 점수를 입력 받는다.
	 * 2. 점수가 90이상이면 A 
	 *    점수가 80이상이면 B 
	 *    점수가 70이상이면 C 
	 *    점수가 60이상이면 D 
	 *    점수가 60미만이면 F
	 * 
	 */

	public static void main(String[] args) {
		char grade;
		int score;
		Scanner input = new Scanner(System.in);

		System.out.println("점수를 입력하시오 : ");
		score = input.nextInt();
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("점수 " + score +"\n학점 "+ grade);
		
		input.close();
	}

}
