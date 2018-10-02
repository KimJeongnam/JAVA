package test;

public class WooriBank extends Bank{
	private double interestRate;

	public WooriBank(){}

	public WooriBank(String bankName, String name, int balance, double interestRate){
		super(bankName, name, balance);
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double interestRate){ this.interestRate = interestRate; }
	public double getInterestRate(){ return this.interestRate; }

	@Override
	public String toString(){
		
		return super.toString()+",[\n\tWooriBank = [ interestRate : "+getInterestRate()+"]\n]";
	}
	
	@Override
	public void printInfo(){
		System.out.println(this);
	}
}