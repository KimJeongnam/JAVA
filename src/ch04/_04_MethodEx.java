package ch04;

public class _04_MethodEx {
	/*
	 *  public 반환형 메소드명(매개변수 ....){ return 반환}
	 *  
	 */
	
	// 더하기
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	// 빼기
	public int sub(int n1, int n2) {
		return n1-n2;
	}
	
	// 곱하기
	public int mul(int n1, int n2) {
		return n1*n2;
	}
	
	// 나누기
	public int div(int n1, int n2) {
		return n1/n2;
	}
	
	public int mod(int n1,int n2) {
		return n1%n2;
	}
	
	public static void main(String[] args) {
		_04_MethodEx calcurator = new _04_MethodEx();
		
		System.out.println("add() : "+calcurator.add(10, 4));
		System.out.println("sub() : "+calcurator.sub(10, 4));
		System.out.println("mul() : "+calcurator.mul(10, 4));
		System.out.println("div() : "+calcurator.div(10, 4));
		System.out.println("div() : "+calcurator.mod(10, 4));
		

		System.out.println("add() : "+calcurator.add(10, 4));
		System.out.println("sub() : "+calcurator.sub(10, 4));
		System.out.println("mul() : "+calcurator.mul(10, 4));
		System.out.println("div() : "+calcurator.div(10, 4));
		System.out.println("div() : "+calcurator.mod(10, 4));
	}
}
