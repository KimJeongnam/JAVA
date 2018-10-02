package ch04;

public class _01_Tv {
	/*
	 * 클래스 : 객체에 대한 설계도(디자인, 틀, 청사진) ...
	 * 
	 */
	private static int count = 0;
	private int id;
	private int channel;
	private int volume;
	private boolean onOff;

	public _01_Tv() {
		// TODO Auto-generated constructor stub
		count++;
		this.channel = 0;
		this.volume = 0;
		this.id = count;
		System.out.println(getName()+" 생성!");
	}

	// getter && setter
	public int getChannel() {
		printChannel();
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.print("setChannel() ");
		printChannel();
	}
	public int getVolume() {
		printVolume();
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.print("setVolume() ");
		printVolume();
	}

	// public Method
	
	public String getName() {
		return "Tv"+id;
	}
	
	public void on() {
		this.onOff = true;
		System.out.println(getName()+" Power On!");
	}
	
	public void off() {
		this.onOff = false;
		System.out.println(getName()+" Power Off!");
	}
	
	public void volumeUp() {
		if(!checkPower())
			return;
		if (volume >= 100) {
			printVolume();
			return;
		}
		this.volume++;
		System.out.print("volumeUp() ");
		printVolume();
	}

	public void volumeDown() {
		if(!checkPower())
			return;
		if (volume <= 1) {
			System.out.print("volumeDown() ");
			printVolume();
			return;
		}
		this.volume--;
		printVolume();
	}

	public void channelUp() {
		if(!checkPower())
			return;
		if(this.channel >= 100) {
			this.channel = 0;
			System.out.print("channelUp() ");
			printChannel();
			return;
		}
		this.channel++;
		System.out.print("channelUp() ");
		printChannel();
	}

	public void channelDown() {
		if(!checkPower())
			return;
		if(this.channel <= 0) {
			this.channel = 100;
			System.out.print("channelDown() ");
			printChannel();
			return;
		}
		this.channel--;
		System.out.print("channelDown() ");
		printChannel();
	}
	
	// protected method
	
	protected boolean checkPower() {
		if(!this.onOff)
			System.out.println(getName()+" is Off please power on!");
		return this.onOff;
	}
	protected void printChannel() {
		System.out.println(getName() + " channel : "+this.channel);
	}
	
	protected void printVolume() {
		System.out.println(getName() + " volume : "+this.volume);
	}
	
	// pubilc static method
	
	public static int getCount() { return count; }
	
	// main method
	public static void main(String[] args) {
		_01_Tv tv = new _01_Tv();
			
		tv.channelUp();	//1
		
		tv.on();
		tv.setChannel(100); //100
		tv.channelUp();	//0
		
		tv.volumeDown();
		tv.volumeUp();
		
		_01_Tv tv2 = new _01_Tv();
		
		tv2.volumeUp();
		
		tv2.on();
		tv2.volumeUp();
		tv2.setVolume(55);
	}
}
