package ch03;

public class _01_ArrayEx {
	/*
	 * 	방법0) 
	 * 		int[] scores;
	 * 		scores = new int[5];
	 * 
	 * 	방법1)
	 * 		int[] scores = new int[6];
	 * 
	 * 	방법 2)\
	 * 		int[] scores = {0, 10, 2, 30,...};
	 */
	
	public static void main(String[] args) {
		int[] scores = new int[11];
		
		int num=0;
		// 100~90 숫자 초기화
		for(int i=100; i>=90; i--) 
			scores[num++] = i;
		
		for(int i=0; i<scores.length; i++) 
			System.out.println(scores[i]);
		
	}
}
