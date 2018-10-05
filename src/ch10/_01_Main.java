package ch10;

public class _01_Main {
	public static void main(String[] args) {
		/*
		 * Thread 생성과 실행
		 * (1) Thread 클래스 상속하기
		 *   - Thread  클래스를 상속받아서 클래스를 작성한다.
		 *   - run() 메소드를 재정의(Override)한다.
		 *   - main() 메소드에서 thread 객체를 생성한다.
		 *   - start() 호출
		 *   
		 * (2) Runnable 인터페이스를 구현
		 * 	 - Runnable 인터페이스를 implements 받아 클래스를 작성한다
		 *   - run() 메소드를 재정의한다.
		 *   - Thread 객체를 생성하고 , implements 한 클래스 객체를 매개변수로 전달
		 *   - start() 메서드를 호출한다.
		 */
		Thread thread = new _01_MyThread();
		Thread thread2 = new Thread(new _02_MyRunnable());
		thread2.start();
		thread.start();
		
		
	}
}
