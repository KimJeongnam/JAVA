package ch08;

import java.util.Scanner;


public class _08_MainMemberEx {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		_08_MemverInfo member = null;
		try {
			member = readMemberInfo();
			member.showMemberInfo();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static _08_MemverInfo readMemberInfo() throws Exception{
		_08_MemverInfo member = new _08_MemverInfo();
		
		member.setName(readName());
		member.setAge(readAge());
		return member;
	}
	
	public static String readName() throws Exception{
		String name = "";
		System.out.print("이름을 입력하세요 : ");
		name = scan.nextLine();
		
		if(name.length()<2) {
			throw new _08_InvlidMemberException(name);
		}
		
		
		return name;
	}
	
	public static int readAge() throws Exception{
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		if(age <1) {
			throw new _08_InvlidMemberException(age);
		}
		return age;
	}
}
