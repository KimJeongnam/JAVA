package ch08;

public class _08_MemverInfo {
	private String name;
	private int age;
	
	public _08_MemverInfo() {}
	public _08_MemverInfo(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	public void showMemberInfo() {
		System.out.println("이름  : "+name + "\n나이 : "+age);
	}

}
