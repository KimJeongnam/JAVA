package test;

public class Audio extends Electro{	
	public Audio(){}

	public Audio(int price){
		super("오디오");
		setPrice(price);
		setPoint((int) (getPrice()*0.0001));		// 형변환 
	}

	@Override
	public String toString(){		// string..
		return "제품명 : "+getName()+" 가격 : "+getPrice()+" 포인트 : "+getPoint();
	}
}