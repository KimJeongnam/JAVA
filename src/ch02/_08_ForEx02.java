package ch02;

public class _08_ForEx02 {
	public static void main(String[] args) {
		/*
		 * 이중 for 문 
		 * Ex 구구단 2~9단
		 */
		
		
		for(int i=2; i<10; i++) {
			System.out.println("=========="+i+"단=============");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
