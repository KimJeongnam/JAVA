package ch05;

public class _02_FireCar extends _02_Car{
	
	public _02_FireCar() {
		// TODO Auto-generated constructor stub
		super.setKind("소방차");
		super.setSpeed(120);
		super.print();
	}
	
	public void Water() {
		System.out.println("물뿌리다.");
	}
}
