package ch02;

public class _01_IfEx01 {
	public static void main(String[] args) {
		/*
		 * if(조건식1) { // 조건식1이 참인 경우 수행
		 * 		명령문1;
		 * 		명령문2;
		 * 		명령문3;
		 * 
		 * } else if(조건식2) { // 조건식2가 참인 경우 수행
		 * 		명령문;
		 * } else if(조건식3) { // 조건식3이 참인 경우 수행
		 * 		명령문;
		 * } else { // 조건식1 or 조건식2 or 조건식3이 거짓일 경우 수행
		 * 		명령문;
		 * }
		*/
		
		int num = 1;
		
		if(num > 0) {
			System.out.println(num + "양수 입니다.");
		} else if (num == 0) {
			System.out.println(num + " 는 0 입니다.");
		} else {
			System.out.println(num + " 음수 입니다.");
		}
		
		System.out.println(!(num>0));
	}

}
