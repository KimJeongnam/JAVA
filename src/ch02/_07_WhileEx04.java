package ch02;

import java.util.Scanner;

public class _07_WhileEx04 {	
	public static void main(String[] args) {
		
		//_07_WhileEx04.select_PrintGugudan();
		
		System.out.println();
		
		_07_WhileEx04.printGugudan();
	}
	
	public static void printGugudan() {
		int i=2;
		
		while(i<10) {
			int j=1;
			System.out.println("===="+i+"단====");
			while(j<10) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			i++;
		}
		System.out.println("=========");
	}
	
	public static void select_PrintGugudan() {
		int i=1;
		int dan = 0;
		Scanner input = PublicScanner.getScanner();
		System.out.print("출력할 구구단 입력 : ");
		dan = input.nextInt();
		
		System.out.println("===="+dan+"단====");
		while(i<10){
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
	}
}
