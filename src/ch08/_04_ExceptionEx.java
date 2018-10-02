package ch08;

import java.util.Scanner;

public class _04_ExceptionEx {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws ArithmeticException{
		/*try {
			readAge();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			scan.close();
		}*/
		readAge();
		scan.close();
	}
	
	public static void readAge() throws ArithmeticException{
		System.out.print("나이를 입력하세요!!!!!!!!!!!!!>>");
		int age = scan.nextInt();
		
		if(age<=0) {
			throw new ArithmeticException("양수만 입력해라");	// 예외 생성하여 강제적으로 발생 throw
		}
		System.out.println("나이 : "+age);
		
	}
}
