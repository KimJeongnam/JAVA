package test;

public class Bank{
	private String bankName;
	private String name;	
	private int balance;

	public Bank(){}
		
	public Bank(String bankName, String name, int balance){
		this.bankName = bankName;
		this.name = name;
		this.balance = balance;
	}

	public void setBankName(String bankName){ this.bankName = bankName; }
	public String getBankName(){ return this.bankName; }
	
	public void setName(String name){ this.name = name; }
	public String getName(){ return this.name; }

	public void setBalance(int balance){ this.balance = balance; }
	public int getBalance(){ return this.balance; }

	@Override
	public String toString(){
		// 최상위 클래스인 Object 의 toString() 재정의
		return "Bank = [ bankName : "+getBankName()+", name : "+getName()+", balance : "+getBalance()+"]";
	}

	public void printInfo(){
		System.out.println(this);
	}

}