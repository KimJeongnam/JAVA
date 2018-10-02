package test;

public class _05_Calculate{
	
	public int add(int n1, int n2){ return n1+n2; }
	public double add(double n1, double n2){ return n1+n2; }

	public int sub(int n1, int n2){ return n1-n2; }
	public double sub(double n1, double n2){ return n1-n2; }

	public int multi(int n1, int n2){ return n1*n2; }
	public double multi(double n1, double n2){ return n1*n2; }

	public int div(int n1, int n2){ return n1/n2; }
	public double div(double n1, double n2){ return n1/n2; }

	public int mod(int n1, int n2){ return n1%n2; }
	public double mod(double n1, double n2){ return n1%n2; }

	public static void main(String[] args){
		_05_Calculate cal = new _05_Calculate();
		
		System.out.println(cal.add(25, 7));
		System.out.println(cal.sub(25, 7));
		System.out.println(cal.multi(25, 7));
		System.out.println(cal.div(25, 7));
		System.out.println(cal.mod(25, 7));

		System.out.println();
		System.out.println(cal.add(3.0, 3.14));
		System.out.println(cal.sub(3.0, 3.14));
		System.out.println(cal.multi(3.0, 3.14));
		System.out.println(cal.div(3.0, 3.14));
		System.out.println(cal.mod(3.0, 3.14));
	
	}
}