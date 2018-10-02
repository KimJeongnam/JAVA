package test;

public class BankMainEx{
	public static void main(String[] args){
		// 다형성 부모클래스인 
		Bank[] bank = new Bank[2];

		bank[0] =   new WooriBank("우리은행", "김정남", 50000, 2.5);
		bank[1] =   new KookminBank("국민은행", "김정남", 1500000, 4.5);

		for(int i=0; i<bank.length; i++){
			bank[i].printInfo();
		}		
	}
}