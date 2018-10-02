package ch03;

public class _03_ArrayEx {
	public static void main(String[] args) {
		/*
		 * 2차원 배열
		 * 1. 방법1 : 
		 * 	int[][] 배열명 = new int [row][col];
		 * 
		 * 2. 방법2 :
		 * 	int[][] 배열명 = {
		 * 				  {1, 2, 3},
		 * 				  {3, 4, 5},
		 * 				  {6, 7, 8},
		 * 				   .
		 * 				   .
		 * 				   .
		 * 				  };
		 */
		int[][] array = new int[2][5];
		
		int score = 60;
		for(int i=0; i<2; i++) {
			for(int j=0; j<5; j++) {
				if(score > 100)
					score = 60;
				array[i][j] = score;
				score += 5;
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int  j=0; j<5; j++) 
				System.out.print("array["+i+"]["+j+"] : "+array[i][j]+" ");
			 System.out.println();
		}
	}
}
