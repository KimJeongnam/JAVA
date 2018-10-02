package ch05;

public class _02_CarMainEx {
	public static void main(String[] args) {
		_02_PoliceCar policeCar = new _02_PoliceCar();
		
		policeCar.Uturn();
		policeCar.Siren();
		System.out.println();
		
		_02_FireCar fireCar = new _02_FireCar();
		fireCar.setSpeed(150);
		fireCar.print();
		fireCar.Uturn();
		fireCar.Water();
	}
}
