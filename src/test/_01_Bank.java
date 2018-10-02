package test;

public class _01_Bank{
	private String bankName;
	private String accountNumber;
	private String customer;
	private int balance;

	public _01_Bank(){}

	public _01_Bank(String bankName, String accountNumber, String customer, int balance){
		this.bankName = bankName;
		this.accountNumber = accountNumber;		//accountNumber 오타
		this.customer = customer;
		this.balance = balance;
	}

	public void printBanckInfo(){
		System.out.println("은행명 : "+this.bankName
				+"\n계좌번호 : "+this.accountNumber
				+"\n예금주 : "+this.customer
				+"\n잔고 : "+this.balance);
	}

	//Getter Setter
	public void setBankName(String bankName){this.bankName = bankName;}
	public String getBankName(){ return this.bankName; }
	
	public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
	public String getAccountNumber(){ return this.accountNumber; }
	
	public void setCustomer(String customer){ this.customer = customer; }
	public String getCustomer() { return this.customer; }

	public void setBalance(int balance) { this.balance = balance; }
	public int getBalance() { return this.balance; }

}