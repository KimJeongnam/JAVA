package ch05;

public class _06_Computer extends _06_ElectroMachine{
	private String keyborad;
	private String mouse;
	private String monitor;
	
	public _06_Computer() {}
	
	public _06_Computer(String brand, int price, String keyborad, String mouse, String monitor) {
		super("Computer", brand, price);
		this.keyborad= keyborad;
		this.mouse = mouse;
		this.monitor = monitor;
	}
	
	public _06_Computer(String name, String brand, int price, String keyborad, String mouse, String monitor) {
		super(name, brand, price);
		this.keyborad= keyborad;
		this.mouse = mouse;
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return super.toString()+"{\n\t_06_Computer [keyborad=" + keyborad + ", mouse=" + mouse + ", monitor=" + monitor + "]\n}";
	}
	
	public String strEx(String s) {
		return s.trim();
	}
	
	public static void main(String[] args) {
		_06_Computer computer = new _06_Computer("조립식", 2000000,"적축 키보드", "로지텍 g602", "밴큐 27인치");
		System.out.println(computer);
		
		String s = "  hello world";
		System.out.println(computer.strEx(s));
		System.out.println(s);
	}
}
