package ch05;

public class _11_Laptop extends _11_ElectroProduct {
	String name;
	
	public _11_Laptop(String name, int price) {
		super(price);
		this.name = name;
	}
	
	public String getName() { return this.name; }

	@Override
	public String toString() {
		return super.toString()+"{\n\t_11_Laptop [name=" + name + "]\n}";
	}
}
