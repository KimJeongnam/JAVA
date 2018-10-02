package ch04;

public class _10_Overloading {
	private int year;
	private String month;
	private int day;
	
	public _10_Overloading() {
		// TODO Auto-generated constructor stub
		this(1900, "1월", 1);
	}
	
	public _10_Overloading(int year) {
		// TODO Auto-generated constructor stub
		this(year, "1월", 1);
	}
	
	public _10_Overloading(int year, String month, int day) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.month = month;
		this.day = day;
	}
	

	public String toJSonString() {
		return "{\n\tyaer:"+year+", \n\tmonth:"+month+", \n\tday:"+day+"\n}\n";
	}
	
	public static void main(String[] args) {
		_10_Overloading date = new _10_Overloading();
		System.out.println(date.toJSonString());
		
		System.out.println();
		_10_Overloading date1 = new _10_Overloading(2007);
		System.out.println(date1.toJSonString());
		
		System.out.println();
		_10_Overloading date2 = new _10_Overloading(1991, "7월", 12);
		System.out.println(date2.toJSonString());
	}
	
}
