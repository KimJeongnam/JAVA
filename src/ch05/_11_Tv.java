package ch05;

public class _11_Tv extends _11_ElectroProduct{
	String name; 
	
	public _11_Tv(String name, int price) {
		super(price);
		this.name = name;
	}
	
	public String getName() { return this.name; }

	@Override
	public String toString() {
		return super.toString()+"{\n\t_11_Tv [name=" + name + "]\n}";
	}
	
	
}
