package test;

public class Notebook extends Electro{

	public Notebook(){}
	public Notebook(int price){
		super("노트북");
		setPrice(price);
		setPoint((int) (getPrice()*0.0002));
	}

	@Override
	public String toString(){
		return "제품명 : "+getName()+" 가격 : "+getPrice()+" 포인트 : "+getPoint();
	}
}