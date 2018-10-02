package ch03;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayEx {
	/*
	 *  과일 ... 5개 
	 */
	
	public static void main(String[] args) {
		int cnt;
		String[] f = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력할 과일 갯수 : ");
		cnt = input.nextInt();
		
		if (cnt > 0) {
			f = new String[cnt];

			for (int i = 0; i < cnt; i++) {
				System.out.print((i + 1) + "번째 과일 : ");
				f[i] = input.next();
			}

			for (int i = 0; i < f.length; i++)
				System.out.println("과일 " + (i + 1) + " : " + f[i]);
		}
		
		
		ArrayList<String> foods = new ArrayList<String>();
		
		while(true) {
			String buf = " ";
			System.out.print("음식 입력 : ");
			buf = input.next();
			if(buf.equals("Quit") || buf.equals("quit"))
				break;
			foods.add(buf);
		}
		
		for(String food : foods) {
			System.out.println(food);
		}
		
		input.close();
	}
}
