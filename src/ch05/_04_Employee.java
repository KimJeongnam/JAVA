package ch05;

public class _04_Employee {
	private String sabun;
	private String name;
	private String address;
	private int salary;
	
	public _04_Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("부모 생성자(default 생성자)");
	}
	
	public _04_Employee(String sabun, String name, String address, int salary) {
		// TODO Auto-generated constructor stub
		System.out.println("부모 생성자(매개변수 생성자)");
		this.sabun = sabun;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	
	// Getter Setter
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("사번 : "+this.sabun
							+"\n이름 : "+this.name
							+"\n집 주소 : "+this.address
							+"\n기본급 : "+this.salary+"원");	
	}
}
