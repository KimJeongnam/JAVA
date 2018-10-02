package ch05;

public class _04_Sawon extends _04_Employee{
	private int sudang;

	public _04_Sawon() {
		// TODO Auto-generated constructor stub
		System.out.println("자식 Sawon 기본 생성자");
	}
	
	public _04_Sawon(String sabun, String name, String address, int salary, int sudang) {
		// TODO Auto-generated constructor stub
		/*super(sabun, name, address, salary);*/
		setSabun(sabun);
		setName(name);
		setAddress(address);
		setSalary(salary);
		System.out.println("자식 Sawon 매개변수 생성자");
		this.sudang= sudang;
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
