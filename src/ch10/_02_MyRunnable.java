package ch10;

public class _02_MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<11; i++) {
			System.out.println("this runnable : "+i);
		}
	}

}
