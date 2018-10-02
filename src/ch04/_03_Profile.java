package ch04;

public class _03_Profile {
	private String name;
	private int age;
	private String address;
	
	public _03_Profile() {
		// TODO Auto-generated constructor stub
		System.out.println("기본 생성자");
		this.name = "홍 길 동";
		this.age = 29;
		this.address = "한양";
	}
	
	public _03_Profile(String name, int age, String address) {
		// TODO Auto-generated constructor stub
		System.out.println("매개변수 생성자");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void getInfo() {
		System.out.println("이름 : "+this.name
						+"\n나이 : "+this.age
						+"\n주소 : "+this.address);
	}
	
	// _03_ProfileMainEx
	public static void main(String[] args) {
		_03_Profile honggildong = new _03_Profile();
		honggildong.getInfo();
		
		_03_Profile my = new _03_Profile("김 정 남", 28, "독산동");
		my.getInfo();
	}
	
}
