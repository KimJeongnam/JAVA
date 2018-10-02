package ch05;

public class _04_Manager extends _04_Employee{
	private int bonus;

	public _04_Manager() {
		// TODO Auto-generated constructor stub
		System.out.println("자식 Manager 기본 생성자");
	}
	
	public _04_Manager(String sabun, String name, String address, int salary, int bonus) {
		// TODO Auto-generated constructor stub
		super(sabun, name, address, salary);
		System.out.println("자식 Manager 매개변수 생성자");
		this.bonus = bonus;
	}
	
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 : "+this.bonus+"원");
	}
}
