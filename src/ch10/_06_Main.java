package ch10;

public class _06_Main {
	public static void main(String[] args) {
		/*
		 * synchronized : 동기화
		 * 
		 * 동기화란 공유된 자원중에서 동시에 사용하면 안되는 자원을 보호하는 도구이다.
		 * 임계영역 (criitical section) :  하나의 사용자가 사용하고 있으면 다른 사용자는 사용이 끝날때 까지 기다려야 한다.
		 * 								이러한 영역을 임계영역이라한다.
		 * 
		 * 동기화 메소드를 만들기 위해서는 synchronized 키워드를 메소드 선언에 붙이면된다.
		 * synchronized 키워드를 사용하면 어떤 한 순간에는 하나의 스레드 만이 임계영역 안에서 실행하는 것이 보장된다.
		 * synchronized 키워드가 붙어 있으면 하나의 스레드가 공유 메소드를 실행하는 동안에
		 * 다른스레드는 공유 메소드를 실행할 수 없다.
		 * 
		 * wait() 메소든느 어던 일이 일어나기를 기다릴 때 사용하는 메소드이다.
		 * notifyAll() 메소드는 반대로 어떤일이 일어났을때 이를 알려주는 메소드이다.
		 * 
		 * <critical section(임계영역) 의 동기화>
		 * critical section이 문제를 일으키지 않으려면 그 부분이 실행되는 동안 다른 스레드가 공유 데이터를 사용할 수 없도록 만들어야 하는데
		 * 그렇게 하는것을 critical section(임계영역)의 동기화라고 한다.
		 * 
		 * 1) 한 계좌의 금액을 다른 계좌로 이체하는 일
		 * 2) 공유 영역(심봉사(2000만원) + 길동이(1000만원))
		 * 3) 두 계좌의 잔액 합계를 출력하는 일을 동시에 한다.
		 * 
		 */
		_06_Account account1 = new _06_Account("110313554999", "심봉사", 20000000);
		_06_Account account2 = new _06_Account("1002248720222", "길동이", 10000000);
		
		_06_SharedArea sharedArea = new _06_SharedArea(account1, account2);
		
		Thread t1 = new Thread(new _06_PrintTotalThread(sharedArea));
		Thread t2 = new Thread(new _06_TransferThread(sharedArea));
		
		t2.start();
		t1.start();
		
	}
}
