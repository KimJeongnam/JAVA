package ch10;

public class _05_Main {
	public static void main(String[] args) {
		// 객체 3개 스레드 3개
		// 각각 영항없이 ㅇ....ㅇ
		_05_VoteThread location1 = new _05_VoteThread();
		_05_VoteThread location2 = new _05_VoteThread();
		_05_VoteThread location3 = new _05_VoteThread();

		Thread loc1 = new Thread(location1, "서울");
		Thread loc2 = new Thread(location2, "광주");
		Thread loc3 = new Thread(location3, "대전");
		
		loc1.start();
		loc2.start();
		loc3.start();
	}
}
