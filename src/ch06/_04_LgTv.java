package ch06;

public class _04_LgTv implements _04_Tv{
	boolean onOff = false;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv On");
		onOff = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv Off");
		onOff = false;
	}

}
