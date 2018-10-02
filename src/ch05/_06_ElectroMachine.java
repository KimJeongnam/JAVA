package ch05;

public class _06_ElectroMachine {
	private String name;
	private String brand;
	private int price;
	
	public _06_ElectroMachine() {}

	public _06_ElectroMachine(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	
	@Override
	public String toString() {
		return "_06_ElectroMachine [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		_06_ElectroMachine machine = new _06_ElectroMachine("다리미", "NoBrand", 50000);
		System.out.println(machine);
		
		int num = 1000;
		String str_num = Integer.toString(num);
		
		System.out.println(str_num);
	}

}
