package ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class _04_DataInputStream {
	public static void main(String[] args) {
		Scanner scan = null;
		double sum = 0;
		PrintWriter out = null;
		String filepath = "C:\\DEV43\\file\\_04_FileWriter.txt";
		String str = "";
		
		try {
			// _04_FileWriter.txt 파일에 값을 저장
			out = new PrintWriter(new FileWriter(filepath));
			out.println("7.5");
			out.println("java is a good language");
			out.println("3.115");
			out.println("1000");
			
			out.flush();	// 버퍼 비우기
			
			// _04_FileWriter.txt 읽어와서 scan에 담는다.
			scan = new Scanner(new BufferedReader(new FileReader(filepath)));
			
			// console 에 출력 .
			
			while(scan.hasNext()) {
				if(scan.hasNextDouble())
					sum += scan.nextDouble();
				else
					str += scan.nextLine();
			}
			
			System.out.printf("%.2f\n", sum);
			System.out.println(str);
			System.out.println("작업 완료 ");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(out != null) out.close();
			if(scan != null)scan.close(); 
		}
	}
}
