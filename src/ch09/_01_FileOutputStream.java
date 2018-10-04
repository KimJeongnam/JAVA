package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _01_FileOutputStream {
	public static void main(String[] args) throws IOException{
		/*
		 * 스트림 : '시냇물'이라는 뜻.. 프로그램에선 일차웑거인 데이터의 흐름을 말함
		 * 
		 * 데이터 방향
		 * 1) 입력 스트림 : 밖에서 프로그램으로 들어오는 스트림
		 * 2) 출력 스트림 : 프로그램에서 밖으로 나가는 스트림
		 * 
		 * 
		 * 데이터 형태 
		 * 1) 문자 스트림 : 사람이 이해할수 있는 문자로 구성된 스트림
		 * 2) 바이트 스트림 : 사람이 이해할 수 없지만 프로그램에서 사용할 수 있는 데이터(8비트)로 구성된 스트림
		 */
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\DEV43\\file\\_01_inputStream.txt");		// 읽는다.	
			out =new FileOutputStream("C:\\DEV43\\file\\_01_outputStream.txt");		// 출력한다.(쓴ㄷ ㅏ)
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Write Done");
			
			/*for(;;) {
				
				 *  InputStream 클래스의 추상메서드
				 *  - abstract int read();
				 *  - 1바이트씩 읽어서 반환한다. (0~255 사이의 정수)
				 *  - 파일의 끝이라면 -1 을 반환 (EOF)
				 
				int i= in.read();
				
				if(i == -1) {
					System.out.println("Write Done");
					break; // 파일의 끝이면 반복 멈춤
				}
				out.write(i);
			}*/
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(in != null) 	in.close();
			if(out != null) out.close();
		}
	}

}
