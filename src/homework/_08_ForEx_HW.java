package homework;

public class _08_ForEx_HW {
	public static void main(String[] args) {
		
		

		/*
		         *
			    **
			   ***
			  ****
			 *****
			******
			 *****
			  ****
			   ***
			    **
			     *
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 0; j--) {
				if (i >= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=5;i>=0;i--) {
			for(int j=1; j<=5-i;j++) 
				System.out.print(" ");
			
			for(int j=0; j<=i;j++)
				System.out.print("*");
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * ***** 
		 * **** 
		 * *** 
		 * ** 
		 * *
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		/*
		 * 留덈쫫紐�
		 */
		
		int n = 9/2;
		
		// 留덈쫫紐� �쐵遺�遺�
		for(int i=0; i<=n; i++){
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			
			for(int j=0; j<i*2+1; j++)
				System.out.print("*");

			System.out.println();
		}
		// 留덈쫫紐� �븘�옯 遺�遺�
		for(int i=n-1; i>=0; i--){
			
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			
			for(int j=1; j<=2*i+1; j++)
				System.out.print("*");
			
			
			System.out.println();
		}

	}

}
