package test;

import java.util.Scanner; //rrrrrrrrrrrr 

public class SwitchCaseEx{

	public static void main(String[] args){
		int jumsu = 0;
		char grade = ' ';
		String result = "합격";

		Scanner input = new Scanner(System.in);

		System.out.print("점수를 입력 하세요 : ");
		jumsu = input.nextInt();
	

		if(jumsu>100 || jumsu<0)
			System.out.println("점수 입력 오류 유효한 숫자가 아닙니다.(1~100)");
		else{

			switch(jumsu/10){
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				result = "불합격";
				break;
			
			}
			System.out.println("당신의 점수는 : "+jumsu+" "+result+"("+grade+")입니다.");

		} 
		input.close();
	}
}