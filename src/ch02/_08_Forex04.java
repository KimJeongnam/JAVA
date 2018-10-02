package ch02;

public class _08_Forex04 {
	/*
	 * 1~20 까지 짝수의 합
	 */
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=20; i++) {
			if(i%2 == 0) {
				sum += i;
				System.out.println(sum);
			}
		}
		System.out.println("1~20 짝수의 합은 : "+sum);
	}
}
