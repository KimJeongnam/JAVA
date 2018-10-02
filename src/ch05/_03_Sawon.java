package ch05;

public class _03_Sawon extends _03_Employee{
	private int sudang;

	public _03_Sawon() {
		// TODO Auto-generated constructor stub
	}
	
	public int getSudang() {
		return sudang;
	}

	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("수당 : "+this.sudang+"원");
	}
}
