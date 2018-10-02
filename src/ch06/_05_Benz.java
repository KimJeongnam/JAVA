package ch06;

public class _05_Benz implements _05_Car{
	private boolean status = false;
	private int speed;
	private String brand = _05_Car.BRAND1;
	private int displacement = _05_Car.DISPLACEMENT1;
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("브랜드명 : "+this.brand);
		System.out.println("배기량 : "+ this.displacement);
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("운전하다.");
		this.status = true;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("정차하다.");
		this.status = false;
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		if(this.speed == 0)
			drive();
		this.speed += 10;
		System.out.println("속도를 올리다. speed : "+this.speed);
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		if(status == false){
			return;
		}
		this.speed -= 10;
		System.out.println("속도를 내리다. speed : "+this.speed);
		if(this.speed == 0) {
			stop();
		}
	}

}
