package test;

public class KookminBank extends Bank{
	private double loanRate;

	public KookminBank(){}

	public KookminBank(String bankName, String name, int balance, double loanRate){
		super(bankName, name, balance);
		this.loanRate = loanRate;
	}
	
	public void setLoanRate(double loanRate){ this.loanRate = loanRate; }
	public double geLoanRate(){ return this.loanRate; }

	@Override
	public String toString(){
		
		return super.toString()+",[\n\tKookminBank = [ loanRate : "+geLoanRate()+"]\n]";
	}
	
	@Override
	public void printInfo(){
		System.out.println(this);
	}
}