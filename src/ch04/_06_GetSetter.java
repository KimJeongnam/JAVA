package ch04;

public class _06_GetSetter {
	// 맴버 변수
	private String name;
	private int price;
	private String brand;

	// 생성자
	public _06_GetSetter() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public _06_GetSetter(String name, int price, String brand) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	// 맴버메소드
	public void printInfo() {
		System.out.println("빵이름 : " + this.name + "\n가격 : " + this.price + "원" + "\n브랜드 : " + this.brand);
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
