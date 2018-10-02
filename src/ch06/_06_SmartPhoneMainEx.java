package ch06;

public class _06_SmartPhoneMainEx {
	public static void main(String[] args) {
		_06_SmartPhone s6 = new _06_SmartPhone();
		
		System.out.println(s6.calculate(10,  8));
		s6.play();
		s6.stop();
		s6.sendSMS();
		s6.receiveSMS();
	}
}
