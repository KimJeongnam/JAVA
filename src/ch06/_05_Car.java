package ch06;

/*'
 * 추상클래스 와 인터페이스의 차이
 * 	- 인터페이스 : 기능정의서(표준 작업 명세서) 강제성, 통일성
 * 				매개 변수에 대해서 서로 합의 하는 것이다. 두 대상(객체) 간의 연결, 대화, 소통을 돕는 중간 역할을 한다.
 * 				설계(선언)와 구현을 분리시키는 것을 가능하게 한다. (설계 : 인터페이스 , 구현 : 자식 클래스)
 * 				객체 생성 불가, 객체 Type 으로 사용  가능(다형성)
 * 				추상 메소드 , 상수로만 이루어져있다. (abstract 생략 가능)
 * 				implements 한 자식 클래스에서 추상메소드 재정의.
 * 
 * 
 * 추상클래스 다중상속 불가 
 * 인터페이스는 다중상속 가능
 * 
 * 3. 인터페이스 다중상속 가능.
 * interface 인터페이스명 extends 인터페이스1, 인터페이스2.....{ }
 */
public interface _05_Car {
	public static final String BRAND1 = "벤츠";
	public static final String BRAND2 = "BMW";
	public static final String BRAND3 = "AUDI";
	
	public static int DISPLACEMENT1 = 3000;
	public static int DISPLACEMENT2 = 2000;	
	
	
	public void getInfo();	
	public void drive();
	public void stop();
	public void speedUp();
	public void speedDown();
}
