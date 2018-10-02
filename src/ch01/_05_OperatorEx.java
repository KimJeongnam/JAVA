package ch01;

import java.util.Scanner;

public class _05_OperatorEx {
	/*
	 * 연산
	 * 1. 사칙연산자
	 */
	
	/*
	 * 연산
	 * 4. 증감연산자
	 * ...
	 * ...
	 * ..
	 * 
	 */
	public static void main(String[] args) {
		_05_OperatorEx.printTitle("사칙연산자 예제");
		
		int i=4, j=2;
		int sum = i+j;
		int sub = i-j;
		int multi = i*j;
		int div = i/j;
		int mod = i%j;
		System.out.println("sum : "+sum);
		System.out.println("sub : "+sub);
		System.out.println("multi : " +multi);
		System.out.println("div : " +div);
		System.out.println("mod : " +mod);
		
		_05_OperatorEx.printTitle("관계연산자 예제");
		int c1 = 5, c2 = 10;
		System.out.println("c1==c2"+(c1==c2));		//false
		System.out.println("c1!=c2"+(c1!=c2));		//true
		System.out.println("c1 > c2"+(c1 > c2));	//false
		System.out.println("c1 < c2"+(c1 < c2));	//true
		System.out.println("c1 >= c2"+(c1 >= c2));	//false
		System.out.println("c1 <= c2"+(c1 <= c2));	//true
		
		/*
		 * 연산
		 * 3. 대입 연산자
		 */
		
		_05_OperatorEx.printTitle("대입연산자 예제");
		
		int x = 5;
		x += 10;
		System.out.println("x : "+x); //15
		x -= 10;
		System.out.println("x : "+x); //5
		x *= 10;
		System.out.println("x : "+ x); // 50
		x /= 5;
		System.out.println("x : "+ x); // 10
		x %= 3;
		System.out.println("x : "+ x); // 1
		
		_05_OperatorEx.printTitle("논리 연산자 예제");
		
		int num1 = 3, num2 = 4;
		System.out.println((num1 == 3) && (num2 == 4)); //true
		System.out.println((num1 == 3) && (num2 == 7)); //false
		System.out.println((num1 == 5) || (num2 == 6)); //false
		System.out.println((num1 == 3) || (num2 == 7)); //true
		
		_05_OperatorEx.printTitle("삼항연산자 예제");
		/*
		 * 조건? 수식1 : 수식2
		 * 참이면 수식1
		 * 거짓이면 수식2
		 */
		int x1 = 10, y1 = 20, z1;
		
		z1 = (x1 > y1)? x1 : y1;
		System.out.println("z1 : "+ z1);
		System.out.println((1>2)?100:200);
		
		// score가 60 이상이면 합격 아니면 불합격을 result2라는 변수에 담아 출력
		int score=0;
		Scanner input = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		score = input.nextInt();
		
		String result = (score>=60)? "합격" : "불합격";
		System.out.println(result);
		
		if(score>=60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println("ifelse : "+result);
		input.close();
	}
	
	public static void printTitle(String str) {
		System.out.println("========"+str+"========");
		
	}
}
