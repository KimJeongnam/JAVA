package ch05;

public class _11_Buyer {
	private int money;
	private int myPoint;
	
	public _11_Buyer(int money){
		this.money = money;
		this.myPoint = 0;
	} 
	public int getMoney() {
		return money;
	}

	public int getMyPoint() {
		return myPoint;
	}
	
	public void reChargeMoney(int money) {
		System.out.println("★★★★"+Cash.moneyToString(money)+"원 충전★★★★");
		this.money += money;
	}
	
	public void buy(_11_ElectroProduct obj) {
		if(money<obj.getPrice()) {
			System.out.println("잔액이 부족합니다. 남은 잔액 : "+Cash.moneyToString(this.money)+"원");
			System.out.println("--필요금액 : "+Cash.moneyToString((obj.getPrice()-this.money))+"원--");
			return;
		}
		String name = "";
		if(obj instanceof _11_Tv) {
			name = ((_11_Tv) obj).getName();
		}else if(obj instanceof _11_Laptop)
			name = ((_11_Laptop) obj).getName();
		
		System.out.println("물건을 삽니다.");
		this.money -= obj.getPrice();
		this.myPoint += obj.getBonusPoint();
		System.out.println(" 제품명:'"+name+ "'\t가격:"+Cash.moneyToString(obj.getPrice())+"원\t잔액  : "+Cash.moneyToString(getMoney())+"원\t\t보너스 포인트 : "+getMyPoint());
	}
	
	@Override
	public String toString() {
		return "_11_Buyer [money=" + money + ", myPoint=" + myPoint + "]";
	}
	
}
