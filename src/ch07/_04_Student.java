package ch07;

public class _04_Student {
	private int number;
	private String name;
	
	public _04_Student() {}
	
	public _04_Student(int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return number + " " + name;
	}
}
