package ch05;

// 부모클래스
public class _01_Animal {
	/*
	 * 자식클래스 extends 부모클래스{...}
	 * 
	 * 부모클래스의 변수와 메소드를 마치 자기것처럼 사용할 수 있다.
	 * extends 확장(파생)의 의미
	 * 
	 * 공통으로 사용하는 변수와 메소드를 부모클래스에서 정의 한다.
	 * 부모클래스는 추상적이고, 자식클래스는 구체적이다.
	 * - 사용이유 : 부모클래스의 변수와 메소드를 재사용 한다.
	 * 			중복되는 코드를 줄일 수 있다. (생산성 증가, 유지보수)
	 * - 부모클래스의 맴버를 private 로 선언한 경우 자식클래스에서 접근 불가 
	 * 				  protected 선언시 자식클래스 접근 가능
	 */
	
	// 필드
	private String kind;
	private int legs;
	
	// 생성자
	public _01_Animal(String kind, int legs) {
		// TODO Auto-generated constructor stub
		this.kind = kind;
		this.legs = legs;
	}
	
	// method
	public void print() {
		System.out.println("legs " +legs+" kind : "+kind);
	}
	
	public void sleep() {
		System.out.println("잔다");
	}
	
	public void eat() {
		System.out.println("먹다");
	}
	
	public void play() {
		System.out.println("놀다");
	}
}
