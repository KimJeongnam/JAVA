package test;

public class Buyer{
	private int money;
	private int my_point;
	
	public Buyer(){}
	

	public Buyer(int money){
		this.money = money;
	}


	public void buy(Electro item){
		if(this.money < item.getPrice()){
			System.out.println("남은잔액 : "+money+"\t잔액이 부족합니다.!!!");
			return;
		}
		
		this.money = this.money - item.getPrice();
		this.my_point += item.getPoint();
		System.out.println("물건을 구매합니다.!");
		System.out.println(item.toString()+" 잔액 : "+this.money+" 누적 포인트 : "+this.my_point);
		
	}

}