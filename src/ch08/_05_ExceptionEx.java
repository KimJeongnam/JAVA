package ch08;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_ExceptionEx {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Object> list;
		try {
			list = readName();
			
			for(Object obj: list) {
				if(obj instanceof String) {
					System.out.println("이름 : "+obj);
				}else if(obj instanceof Integer) {
					System.out.println("나이 : "+obj);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Object> readName() throws Exception{
		ArrayList<Object> list = new ArrayList<Object>();
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		if(name.length()<2) {
			throw new userNameException();
		}
		list.add(name);
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		if(age<=0) {
			throw new userAgeException();
		}
		list.add(age);
		return list;
	}
}
class userAgeException extends Exception{
	/**
	 *  Custom Exception
	 */
	private static final long serialVersionUID = 1L;

	public userAgeException() {
		super("나이는 0보다 큰 양수 입니다.");
	}
}

class userNameException extends Exception{
	/**
	 *  Custom Exception
	 */
	private static final long serialVersionUID = 1L;

	public userNameException() {
		super("이름은 2글자 이상입니다.");
	}
}
