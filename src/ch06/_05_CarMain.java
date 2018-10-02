package ch06;

public class _05_CarMain {
	public static void main(String[] args) {
		_05_Car banz = new _05_Benz();
		
		banz.getInfo();
		
		for(int i=0; i<10; i++)
			banz.speedUp();
		
		for(int i=0; i<10; i++)
			banz.speedDown();
	}
}
