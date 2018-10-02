package ch05;

public class _11_MainEx {
	public static void main(String[] args) {
		/*
		 * 원금 100만원
		 * 제품명 : 노트북, 가격 : 200,000   잔액 : 800,000  보너스 포인트 : 2000
		 * 제품명 : Tv ,  가격 : 300,000  잔액 : 500,000   보너스 포인트 : 5000
		 */
		_11_Buyer my = new _11_Buyer(1000000);
		_11_ElectroProduct laptop = new _11_Laptop("노트북", 200000);
		_11_ElectroProduct tv = new _11_Tv("Tv", 300000);
	
		System.out.println(my);
		System.out.println(laptop);
		System.out.println(tv);
		System.out.println();
		
		for(int i=0; i<6; i++) {
			if(i%3==0)
				my.buy(tv);
			else
				my.buy(laptop);
		}
		System.out.println();
		
		my.reChargeMoney(1500000);
		System.out.println();
		
		for(int i=0; i<12; i++) {
			if(i%3==0)
				my.buy(tv);
			else
				my.buy(laptop);
		}
	}
}
