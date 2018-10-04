package ch09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class _02_ImageCopy {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		
		System.out.print("원본 파일 이름을 입력하세요 : ");
		String inputpath = input.next();
		
		System.out.print("복사 파일 이름을 입력하세요 : ");
		String outputPath = input.next();
		
		InputStream in = null;
		OutputStream out = null;
		
		in = new FileInputStream(inputpath);
		out = new FileOutputStream(outputPath);
		
		int i;
		while((i=in.read()) != -1)
			out.write(i);
		
		System.out.println("'"+inputpath+"'  make a copy  '"+outputPath+"' File write Done.");
	}
}
