package test;

import java.util.*;	// java.utils = X 

public class IfTest{

	public static void main(String[] args){
		int jumsu;
		char grade;
		String result;

		Scanner input = new Scanner(System.in);
			
		System.out.println("점수를 입력하세요 : ");
		jumsu = input.nextInt();
		
		result = "합격";

		if(jumsu<0 || jumsu>100){		// AND가 아니라 OR
			System.out.println("유효 숫자가 아닙니다. 0~100 사이의 수를 입력해주세요.");
		}else{
			if(jumsu >= 90){
				grade = 'A';
			}else if(jumsu >= 80){
				grade = 'B';
			}else if(jumsu >= 70){
				grade = 'C';
			}else if(jumsu >= 60){
				grade = 'D';
			}else{
				grade = 'F';		
				result = "불합격";		
			}
			System.out.println("당신의 점수는 "+jumsu+"이며 "+grade+"("+result+") 입니다.");
		}
		
		input.close();
		
		return;
	}	
}