package ch06;

public class _06_SmartPhone extends _06_PDA implements _06_MobileInterface,  _06_Mp3Interface{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("mp3 재생");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("mp3 정지");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자 전송");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자 수신");
	}

}
