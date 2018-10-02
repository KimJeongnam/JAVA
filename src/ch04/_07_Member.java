package ch04;

public class _07_Member {
	private String name;
	private int age;
	private String hobby;
	
	public _07_Member() {
		// TODO Auto-generated constructor stub
	}
	
	public _07_Member(String name, int age, String hobby) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	public void getInfo() {
		System.out.println("이름 : "+this.name
						+"\n나이 : "+this.age
						+"\n취미 : "+this.hobby);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
