package ch05;

public class _01_Cat extends _01_Animal{
	private String name;
	
	public _01_Cat(String name) {
		// TODO Auto-generated constructor stub
		super("고양이", 4);
		this.name = name;
		super.print();
	}
	
	public void cry() {
		printName();
		System.out.println("야~~오오오옹");
	}
	
	public void punch() {
		printName();
		System.out.println(" 냥냥!");
	}
	public void printName() {
		System.out.print("("+name+")");
	}
	
	@Override
	public void sleep() {
		printName();
		System.out.print("가 코~~");
		super.sleep();
	}
	
	@Override
	public void eat() {
		printName();
		System.out.print("가 개걸스럽게");
		super.eat();
	}
	
	@Override
	public void play() {
		printName();
		System.out.print("가 솜뭉치를 가지고");
		super.play();
	}
}
