package ch05;

public class _10_MidSchool extends _10_School implements _10_getHandler{
	private int score;

	public _10_MidSchool() {}
	
	public _10_MidSchool(String schoolName, String studentNumber, String name, int grade, int score) {
		super(schoolName, studentNumber, name, grade);
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}


	
	@Override
	public String toString() {
		return super.toString()+"{\n\t_10_MidSchool [score=" + score + ", getScore()=" + getScore() + "]\n}";
	}

	@Override
	public Object getGrade_Gpa() {
		Integer obj = getScore();
		return obj;
	}	
}
