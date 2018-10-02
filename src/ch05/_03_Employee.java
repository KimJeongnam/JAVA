package ch05;

public class _03_Employee {
	private String sabun;
	private String name;
	private String address;
	private int salary;
	
	
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
