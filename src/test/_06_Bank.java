package test;

public class _06_Bank{
	String bankName;
	String name;
	int money;
	String telNo;

	public _06_Bank(){		//// Bank syntax Error
		System.out.println("Default 생성자");
	}
	
	public _06_Bank(String bankName, String name, int money, String telNo){ //// Bank syntax Error
		System.out.println("�Ű����� ������");
		this.bankName = bankName;
		this.name = name;
		this.money = money;
		this.telNo = telNo;
	}
	
	public void getInfo(){
		System.out.println("은행 : "+ this.bankName
				+"\n입금자 : "+this.name
				+"\n입금액 : "+this.money
				+"\n전화번호 :  "+this.telNo); // telNO syntax Error
	}

	public void setBankName(String bankName){ this.bankName = bankName; }
	public String getBankName(){ return this.bankName; }

	public void setName(String name){ this.name = name; }
	public String getName(){ return this.name; }

	public void setMoney(int money){ this.money = money; }
	public int getMoney(){ return this.money; }

	public void setTelNo(String telNo){ this.telNo = telNo; }
	public String getTelNo(){ return this.telNo; }

	public static void main(String[] args){
		_06_Bank bank = new _06_Bank();
		
		bank.setBankName("우리은행");
		bank.setName("홍 길 동");
		bank.setMoney(150000);
		bank.setTelNo("010-4444-4444"); // settelNo syntax Error
		bank.getInfo();

		_06_Bank bank2 = new _06_Bank("신한은행", "철 수", 3000000, "010-5565-8890");

		System.out.println("==== getter ===");
		System.out.println(bank2.getBankName());	
		System.out.println(bank2.getName());
		System.out.println(bank2.getMoney());
		System.out.println(bank2.getTelNo());
	}
}