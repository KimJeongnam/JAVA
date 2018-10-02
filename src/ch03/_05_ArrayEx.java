package ch03;

public class _05_ArrayEx {
	/*
	 * 		***성적표***
	 * 	=========================
	 * 	번호 	국어 	영어 	수학 	총점 	평균
	 * 	=========================
	 * 	1	100	100	100	300	100
	 * 	2	90	90	90	270	90	
	 * 	3	80	80	80	240	80
	 * 	4	70	70	70	210	70
	 * 	5 	60	60	60	180	60
	 * 	========================
	 * 	합계	400	400	400	
	 * 	평균 : 소수점 이하 둘째 자리
	 */
	int[][] scores = new int[5][3];
	
	int[] c_total = new int[3];
	
	public _05_ArrayEx() {
		// TODO Auto-generated constructor stub
		int jumsu = 100;
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				scores[i][j] = jumsu;
			}
			jumsu -= 10;
		}
	}
	
	// 과목 총점 출력 함수
	// Class -> 과목  index 0,1,2 순서로 국어, 영어, 수학
/*	public int rowTotal(int Class) {
		int sum = 0;
		for(int i=0; i<scores.length; i++)
			sum += scores[i][Class];
		return sum;
	}*/
	
	
	// 합계와 갯수를 입력하면 평균을 구하는 함수
	public double getAvg(int sum, int size) {
		return (double)sum/size;
	}
	
	
	// 헤더 출력
	public void printHeader() {
		System.out.println("\t***성적표***");
		System.out.println("========================================");
		System.out.println("번호        국어       영어       수학      총점       평균         학점");
	}
	
	// 과목 총점및 평균 출력하는 풋터 함수
	public void printFooter() {
		System.out.println("========================================");
		System.out.print("합계   ");

		for(int i=0; i<scores[0].length; i++) {
			System.out.printf("%6d", this.c_total[i]);
		}
		
		System.out.print("\n평균 ");
		for(int i=0; i<scores[0].length; i++) {
			double b = getAvg(this.c_total[i], scores.length);
			System.out.printf("%4.2f ", b);
		}
	}
	
	public char getGrade(int avg) {
		char grade = 'F';

		switch (avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		}
		
		return grade;
	}
	
	
	// 번호및 각 과목별 점수, 총점, 평균 출력 함수
	public void print() {
		printHeader();
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			System.out.printf("%2d", i+1);
			for(int j=0; j<scores[i].length; j++) {
				if(j==0) {
					c_total[j] += scores[i][j];
				} else if(j==1) {
					c_total[j] += scores[i][j];
				}else if(j==2){
					c_total[j] += scores[i][j];
				}
				sum += scores[i][j];
				System.out.printf("%6d",scores[i][j]);
			}
			System.out.printf("%6d", sum);
			System.out.printf("%6d", (int)getAvg(sum, 3));
			System.out.printf("%6c", getGrade((int)getAvg(sum, 3)));
			System.out.println();
			
			sum = 0;
		}
		printFooter();
	}
	
	public static void main(String[] args) {
		_05_ArrayEx a = new _05_ArrayEx();
		
		a.print();
	}
}
