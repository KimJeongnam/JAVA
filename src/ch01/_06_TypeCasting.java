package ch01;

public class _06_TypeCasting {
	public static void main(String[] args) {
		/*
		 * 형변환-1 p81
		 * 1. 자동 형변환
		 * 		데이터가 손실되지 않거나, 손실이 제한적인 범위내에서 묵시적으로 형 변환 한다.
		 * 		자료형이 다른 변수에 값을 할당하는 경우 형변환을 생략할 수 있다.
		 * 		
		 * 	데이터 큰 타입 = 데이터 작은타입; ex) double d = 10;
		 * 	자료형이 다른 값을 연산 ex) double = 10.0+20;
		 * 
		 * 2. 강제적 형변환(축소 형변환, 명시적 형변환)
		 * 		명시적으로 형변환 하는 것을 캐스팅(Casting)이라고 한다.
		 * 		생략 x , 생략시 컴파일 Error 발생 하므로 반드시 명시해야함
		 * 		강제로 형변환 하므로 데이터 손실 위험이 있다.
		 * 	데이터 작은 타입 = (작은 타입) 데이터 큰타입; 
		 * 
		 */
		_05_OperatorEx.printTitle("형변환-1 예제");
		int j= (int)10.9; //강제 형변환
		System.out.println("j : "+j);
		
		double d = 10; //자동 형변환(확대 형변환)
		System.out.println(d);
		
		float f = 20.5f+10;
		System.out.println("f : "+f);
		
		/*
		 * 형변환-2
		 * 3. int(4byte) 보다 크기가 작은 자료형은 int형으로 형변환 한 후 계산한다.
		 *    예) byte + short -> int+int
		 * 
		 * 4. 두개의 피연산자 중 표현 범위가 큰 쪽에 맞추어서 형변환 한 후에 계산을 한다.
		 */
		_05_OperatorEx.printTitle("형변환-2 예제");
		int a;
		double dd;
		
		dd = 5/4; //자동 형 변환
		System.out.println("dd : "+dd);	// 1.0
		
		dd = (double)5/4;
		System.out.println("dd : "+dd); // 4번 적용 double / int -> double/double -> 5.0/4.0 ->1.25
		
		a = (int)2.5 + (int)3.1;
		// a = (int)(2.5 + 3.1);
		System.out.println("a : "+a);
		/*a = (int)2.5+3.1;*/
		
		
		int gg = 1000000;
		int hh = 2000000;
		long ll = 2000000L;
		
		int c1 = gg*hh;
		System.out.println(c1); // overflow 범위 초과 (-21~ 21 초과)
				
		long c2 = gg*hh;	// 형 변환 필요
		System.out.println(c2);
		
		c2 = (long)(gg*hh);	//(변환전 계산됨)
		System.out.println(c2);
		
		c2 = (long)gg * (long)hh;
		System.out.println(c2);
		
		c2 = (long)gg*hh;
		System.out.println(c2);
		
		c2 = gg*ll; // int * long -> long * long -> long
		System.out.println(c2);
	}
}
