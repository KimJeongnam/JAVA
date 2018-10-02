package ch01;

public class _07_PrintEx {
	public static void main(String[] args) {
		/*
		 * printf(형식 지정자, 값 또는 변수)
		 *  - 형식 지정자
		 *  %d : 정수를 출력한다. 예) System.out.printf("%d", 10);
		 *  %f : 실수를 출력한다. 예) System.out.printf("%f", 3.14);
		 *  %c : 문자를 출력한다. 예) System.out.printf("%c", 'c');
		 *  %s : 문자열을 출력한다. 예) System.out.printf("%s", "Hello");
		 */
		double value = 1.0/3.0;
		System.out.println(value);
		System.out.printf("%%f : %f\n", value);
		System.out.printf("%%f : %6.2f\n", value);
		
		//"900101" <- 주민번호 앞 6자리
		System.out.printf("%%s : %s", "900101");
		
	}
}
