package ch02;

public class _08_ForEx03 {
	public static void main(String[] args) {
		/*
		 *  1~10까지 합구하기
		 */
		int sum = 0;
		for(int i=1; i<=10;i++)
			sum += i;
		
		System.out.println(sum);
		
		for( ; ; ) {
			System.out.println("This is loooooooooop");
		}
	}
}
