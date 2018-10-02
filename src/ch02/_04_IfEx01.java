package ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_IfEx01 {
	public static void main(String[] args) {
		int score = 0;
		String str;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		score = input.nextInt();
		
		if(score >= 60) {
			str = "합격";
		}else {
			str = "불합격";
		}
		
		System.out.println("당신의 점수는 : "+score+"  "+str+" 입니다.!");
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.println(list.size());
		
		input.close();
	}
}
