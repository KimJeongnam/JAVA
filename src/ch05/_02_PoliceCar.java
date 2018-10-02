package ch05;

public class _02_PoliceCar extends _02_Car{
	public _02_PoliceCar() {
		// TODO Auto-generated constructor stub
		super.setKind("경찰차");
		super.setSpeed(180);
		super.print();
	}
	
	public void Siren() {
		System.out.println("사이렌 울리다(삐용삐용)");
	}
}
