package ch10;

public class _06_Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public _06_Account() {
		// TODO Auto-generated constructor stub
	}
	
	public _06_Account(String accountNo, String ownerName, int balance) {
		// TODO Auto-generated constructor stub
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	
	// 입금
	public void deposit(int amount) {
		balance += amount;
	}
	// 출금
	public int withrow(int amount) {
		if(balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}
	
}
