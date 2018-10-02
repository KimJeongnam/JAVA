package homework;

public class Person {
	private static int numberOfPerson;
	
	private int age;
	private String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
		this.age = 12;
		this.name = "";
		numberOfPerson++;
	}
	public Person(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		numberOfPerson++;
	}
	
	public void selfintroduce() {
		System.out.println("내 이름은 "+name+"이며, 나이는 "+age+"입니다.");
	}
	
	public static int getPopulation() {
		return numberOfPerson;
	}
	public static void main(String[] args) {
		Person p1 = new Person(12, "김자바");
		System.out.println("현재 인구수는 "+Person.getPopulation()+"명 입니다.");
		
		Person p2 = new Person(27, "박자바");
		System.out.println("현재 인구수는 "+Person.getPopulation()+"명 입니다.");
		
		Person p3 = new Person(28, "이자바");
		System.out.println("현재 인구수는 "+Person.getPopulation()+"명 입니다.");
		
		p1.selfintroduce();
		p2.selfintroduce();
		p3.selfintroduce();
	}
}
