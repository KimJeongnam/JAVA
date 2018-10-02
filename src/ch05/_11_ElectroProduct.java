package ch05;

public class _11_ElectroProduct {
	private int price;
	private int bonusPoint;
	
	public _11_ElectroProduct(){}
	
	public _11_ElectroProduct(int price){
		this.price = price;
		this.bonusPoint  = price/100;
	}
	
	public int getPrice() {
		return price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	@Override
	public String toString() {
		return "_11_ElectroProduct [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
