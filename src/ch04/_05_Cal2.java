package ch04;

public class _05_Cal2 {
	//Overload
	
	// 더하기
	public int add(int n1, int n2) {return n1+n2;}
	public double add(double n1, double n2) { return n1+n2;}
	
	// 빼기
	public int sub(int n1, int n2) {return n1-n2;}
	public double sub(double n1, double n2) {return n1-n2;}
	
	// 곱하기
	public int mul(int n1, int n2) {return n1*n2;}
	public double mul(double n1, double n2) {return n1*n2;}
	
	// 나누기
	public int div(int n1, int n2) {return n1/n2;}
	public double div(double n1, double n2) {return n1/n2;}
	
	// 나머지
	public int mod(int n1,int n2) {return n1%n2;}
	public double mod(double n1, double n2) {return n1%n2;}
	
	public static void main(String[] args) {
		_05_Cal2 cal = new _05_Cal2();
		
		System.out.println("========정수형 계산 결과==========");
		System.out.printf("printf : %d\n", cal.add(10,4));
		System.out.println(cal.sub(10,4));
		System.out.println(cal.mul(10,4));
		System.out.println(cal.div(10,4));
		System.out.println(cal.mod(10,4));
		
		System.out.println("========실수형 계산 결과==========");
		System.out.printf("printf : %6.4f\n", cal.add(4.0,2.0));
		System.out.println(cal.sub(4.0,2.0));
		System.out.println(cal.mul(4.0,2.0));
		System.out.println(cal.div(4.0,2.0));
		System.out.println(cal.mod(4.0,2.0));
		
	}
}
