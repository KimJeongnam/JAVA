package ch10;

public class _06_SharedArea {
	_06_Account account1;	// 심봉사
	_06_Account account2;	// 길동이
	
	public _06_SharedArea(_06_Account account1, _06_Account account2) {
		this.account1 = account1;
		this.account2 = account2;
	}

	//계좌이체
	public synchronized void transfer(int cnt, int amount) {
		account1.withrow(amount);
		System.out.println("count : "+cnt);
		System.out.println(account1.getOwnerName()+" 계좌 "+amount+" 인출, ");
		
		account2.deposit(amount);
		System.out.println(account2.getOwnerName()+" 계좌 "+amount+" 입금");
	}
	
	//잔액 합계를 구한다.
	public synchronized int getTotal() {
		return account1.getBalance()+account2.getBalance();
	}
}
