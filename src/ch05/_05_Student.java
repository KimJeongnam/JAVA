package ch05;

public class _05_Student {
	private int nubmer;
	private String name;
	private int age;
	
	public _05_Student() {
		// TODO Auto-generated constructor stub
		this(0, "", 0);
	}
	
	public _05_Student(int number, String name, int age) {
		// TODO Auto-generated constructor stub
		this.nubmer = number;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "_05_Student [nubmer=" + nubmer + ", name=" + name + ", age=" + age + "]";
	}

	/*@Override
	public String toString() {
		return "학번 : "+this.nubmer+"\n이름 : "+this.name+"\n나이 : "+this.age;
	}
*/	
	public void printInfo(){
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		_05_Student std = new _05_Student();
		std.printInfo();
		
		_05_Student std1 = new _05_Student(201010385, "(님)고소영", 40);
		std1.printInfo();
	}
}
