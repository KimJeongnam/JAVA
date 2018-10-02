package ch04;

public class _01_TvMainEx {
	public static void main(String[] args) {
		_01_Tv tv = new _01_Tv();
		
		tv.channelUp();	//1
		
		tv.on();
		tv.setChannel(100); //100
		tv.channelUp();	//0
		
		tv.volumeDown();
		tv.volumeUp();
		System.out.println("======================================");
		
		_01_Tv tv2 = new _01_Tv();
		tv2.volumeUp();
		System.out.println("======================================");
		
		tv2.on();
		tv2.volumeUp();
		tv2.setVolume(55);
		
		/*_01_Tv tv3 = new _01_Tv();
		_01_Tv tv4 = new _01_Tv();*/
		
		System.out.println("지금까지 만든 tv 수 : "+_01_Tv.getCount());
	}
}
