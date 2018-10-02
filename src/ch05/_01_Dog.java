package ch05;

public class _01_Dog extends _01_Animal{
	private String name;
	
	public _01_Dog(String name) {
		// TODO Auto-generated constructor stub
		super("개", 5);
		this.name = name;
		super.print();
		
	}
	public void bark() {
		printName();
		System.out.println("월월!");
	}
	
	public void bite() {
		printName();
		System.out.println("크앙!");
	}
	public void printName() {
		System.out.print("("+this.name+")");
	}
	
	public void eat() {
		printName();
		System.out.print("가 우왁스럽게");
		super.eat();
	}
	
	public void play() {
		printName();
		System.out.print("가 공을가지고 ");
		super.play();
	}
	
	public void sleep() {
		printName();
		System.out.print("가 침을흘리며 ");
		super.sleep();
	}
}
