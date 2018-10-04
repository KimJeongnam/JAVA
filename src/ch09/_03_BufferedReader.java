package ch09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _03_BufferedReader{
	public static void main(String[] args) throws IOException{
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("C:\\DEV43\\file\\_03_FileReader.txt"));
			out = new PrintWriter(new FileWriter("C:\\\\DEV43\\\\file\\\\_03_FileWriter.txt"));
			
			int c;
			while((c=in.read())!=-1)
				out.write(c);
			
			System.out.println("Copy Done");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}
}
