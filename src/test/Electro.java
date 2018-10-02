package test;

public class Electro{
	private String name;
	private int price;
	private int point;
	
	public Electro(){}

	public Electro(String name){
		this.name = name;
	}
	
	public void setPrice(int price) {this.price = price; }
	public void setPoint(int point) { this.point = point; }

	public String getName(){ return name; }
	public int getPrice(){ return price; }
	public int getPoint(){ return this.point; }
}