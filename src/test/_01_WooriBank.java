package test;

public class _01_WooriBank extends _01_Bank{
	double interestRate;
	
	public _01_WooriBank (){}
	
	public _01_WooriBank(String bankName, String accountNumber, String customer, int balance, double interestRate){
		super(bankName, accountNumber, customer, balance);
		this.interestRate = interestRate;
	}

	public void setInterestRate(double interestRate){ this.interestRate = interestRate; }
	public double getInterestRate(){ return this.interestRate; }
	
	@Override
	public void printBanckInfo(){
		super.printBanckInfo();
		System.out.printf("이자율 : %3.1f\n", this.interestRate); // ; syntax Error
	}
}