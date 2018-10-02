package ch04;

public class _07_MemberMainEx {
	public static void main(String[] args) {
		// 매개변수 생성자를 이용하여 출력
		_07_Member member1 = new _07_Member("홍길동", 56, "약탈");
		member1.getInfo();
		
		System.out.println();
		// 기본생성자와 setter를 이용해 출력
		_07_Member member2 = new _07_Member();
		
		member2.setName("홍길자");
		member2.setAge(33);
		member2.setHobby("내조");
		member2.getInfo();
		
		System.out.println("\n== getter ==");
		System.out.println("getName() "+member2.getName());
		System.out.println("getAge() "+member2.getAge());
		System.out.println("getHobby() "+member2.getHobby());
	}
}
