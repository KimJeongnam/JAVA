package test;

public class _04_Member{
	// 맴버변수(필드)
	private String name;
	private int age;
	private String email;
	
	// default 생성자
	public _04_Member(){
		this.name = "홍 길 동";
		this.age = 125;
		this.email = "honggilddong@joseon.com";
	}

	// 매개변수로 초기화 하는 생성자
	public _04_Member(String name, int age, String email){
		this.name = name;
		this.age = age;
		this.email = email;
	}	

	// 맴버 변수 출력 함수(메서드).
	public void memberInfo(){
		System.out.println("이름 : "+this.name
				+ "\n나이 :  "+this.age
				+ "\n이메일 : "+this.email);
	}

	public static void main(String[] args){
		_04_Member hong = new _04_Member(); 	//hong 맴버 생성
		hong.memberInfo();			//hong 맴버 정보 출력

		_04_Member  my = new _04_Member("김 정 남", 28, "kim910712@gmail.com");	// my 맴버 생성
		my.memberInfo();							// my 정보 출력
	}	
}