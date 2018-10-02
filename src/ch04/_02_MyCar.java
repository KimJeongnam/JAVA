package ch04;

public class _02_MyCar {
	// 맴버 변수
	private String brand;
	private String carName;
	private int price;
	private int cc;
	private String color;
	private String year;
	
	// 생성자
	public _02_MyCar() {
		// TODO Auto-generated constructor stub
		System.out.println("create Car");
		this.brand = "현기차";
		this.carName = "말티즈";
		this.price = 1;
		this.cc = 1200;
		this.color = "덩색";
		this.year = "10년식";
	}
	
	public _02_MyCar(String brand, String carName, int price, int cc, String color, String year) {
		this.brand = brand;
		this.carName = carName;
		this.price = price;
		this.cc = cc;
		this.color = color;
		this.year = year;
	}
	
	// 멤버 메소드
	public void getMyCharinfo() {
		System.out.println("brand : "+this.brand
						+"\nCar Name : "+this.carName
						+"\nPrice : "+ this.price
						+"\ncc : "+ this.cc
						+"\nColor : "+ this.color
						+"\nYear : "+this.year);
	}
	
	public static void main(String[] args) {
		_02_MyCar myCar = new _02_MyCar();
		
		myCar.getMyCharinfo();
		
		System.out.println();
		_02_MyCar myCar2 = new _02_MyCar("BMW",
										"소나타",
										5000000,
										2000,
										"검은색",
										"3년식");
		
		myCar2.getMyCharinfo();
	}
}
