package ch01;

import java.util.Scanner;

public class _03_InOutEx {

	public static void main(String[] args) {

		String name=null;
		int age = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("name : ");
		name = input.nextLine();

		System.out.print("age : ");
		age = input.nextInt();
		
		System.out.println(name);
		System.out.println(age);

		input.close();

	}

}
