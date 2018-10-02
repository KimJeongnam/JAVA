package test;


public class TwoArrayScore{
	private int[][] scores = {
		{100, 90, 80, 70},
		{90, 80, 90, 80},
		{80, 100, 50, 40},
		{70, 80, 50, 30}
	};		// ; 
	
	private int[] classTotal = new int[4];

	public void printHeader(){
		System.out.println("\t\t*** 자바 전문가 과정 ***");
		System.out.println("=======================================================");
		System.out.printf("No |   java    jsp   spring   sql  | Total | 평균   | 학점 |\n");
	}
	public double getAvg(int total , int cnt){ return (double)total/cnt; }
	public char getGrade(double avg){
		char grade = 'F';
		
		switch((int)avg/10){
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

	public void result(){
		printHeader();
		for(int i=0; i<scores.length; i++){
			classTotal[0] += scores[i][0];
			classTotal[1] += scores[i][1];
			classTotal[2] += scores[i][2];
			classTotal[3] += scores[i][3];
			
			int total = 0;
			System.out.print(i+1+"  |");
			for(int j=0; j<scores[0].length; j++){
				System.out.printf("%7d", scores[i][j]);
				total += scores[i][j];
			}
			System.out.printf("   |%5d  |%2.2f|%4c|", total, getAvg(total, scores[0].length), getGrade(getAvg(total,scores[0].length)));
			
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.print("총점 |");
		for(int i=0; i<scores.length; i++){
			System.out.printf("%7d", classTotal[i]);
		}
		System.out.println();

		System.out.print("평균 |");
		for(int i=0; i<scores.length; i++){
			System.out.printf("%7.2f", getAvg(classTotal[i], scores.length));
		}
		System.out.println("\n=======================================================");
	}

	public static void  main(String[] args){
		TwoArrayScore score = new TwoArrayScore();
		score.result();
	}
}