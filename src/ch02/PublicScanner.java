package ch02;

import java.util.Scanner;

public class PublicScanner {
	private static Scanner input = null;

	public synchronized static Scanner getScanner() {
		if(input == null) 
			 input = new Scanner(System.in);
		return input;
	}
}
