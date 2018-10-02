package ch02;

public class _06_SwitchCaseEx01 {
	public static void main(String[] args) {
		/*
		 * 조건문 switch case ==> 변수와 일치하는 값을 가진 case 절이 실행 switch(변수 | 수식){ case 값1: 명령문
		 * 1; break; case 값2: 명령문2; break; case 값3: 명령문3; ] break; ... default: 기타 처리문장;
		 * break; }
		 */

		int num = 8;
		String str = "나비";
		String result = "";

		switch (num) {
		case 1:
			result = "하나";
			break;
		case 2:
			result = "둘";
			break;
		case 3:
			result = "셋";
			break;
		case 4:
			result = "넷";
			break;
		default:
			result = "많음";
			break;
		}
		System.out.println(result);

		switch (str) {
		case "나비":
			System.out.println("나비다");
			break;
		default:
			System.out.println("나비가 아니다.");
			break;
		}
	}
}
