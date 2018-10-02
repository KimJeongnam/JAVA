package test;

public class _01_KaKaoBank extends _01_Bank{	// public 오타
	private double loanRate;
	
	public _01_KaKaoBank(){}

	public _01_KaKaoBank (String bankName, String accountNumber, String customer, int balance, double loanRate){
		super(bankName, accountNumber, customer, balance);
		this.loanRate = loanRate;
	}
	
	public void setLoanRate(double loanRate){ this.loanRate = loanRate; }
	public double getLoanrate(){ return this.loanRate; }

	@Override
	public void printBanckInfo(){
		super.printBanckInfo();
		System.out.printf("대출 금리 : %3.1f\n", this.loanRate);
	}
}