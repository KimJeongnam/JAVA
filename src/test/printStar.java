package test;

public class printStar{
	public void printDiamond(int high){
		int n = high/2;	

		/*	
		 * 윗부분
		 * high = 7 -> n = 3
		 * 
		 * 4번출력 해야하므로 1~4
		 */
		for(int i=1;i<=n+1; i++){		
			for(int j=0; j<=n-i; j++)
				System.out.print(" ");
			// i가 0일때 출력이 안되므로 i는 1부터 시작한다.
			for(int j=0; j<i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}

		/*	
		 * 아랫부분
		 * high = 7 -> n = 3
		 * 
		 * 3번출력 해야하므로 3~1
		 */
		for(int i=n; i>0; i--){
			for(int j=0; j<=n-i; j++)
				System.out.print(" ");
			// i가 0일때 출력이 안되므로 i최소값이 1이 되도록 i>0 을한다.
			for(int j=0; j<i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printStar s = new printStar();
		
		s.printDiamond(7);
	}
}