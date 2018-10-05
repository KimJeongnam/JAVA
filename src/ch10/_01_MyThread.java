package ch10;

public class _01_MyThread extends Thread{
	
	@Override
	public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("this thread extends : "+i);
			}
	}
}
