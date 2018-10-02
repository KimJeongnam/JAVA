package ch05;

public class _10_College extends _10_School implements _10_getHandler{
	private double gpa;
	
	public _10_College() {
		// TODO Auto-generated constructor stub
	}
	
	public _10_College(String schoolName, String studentNumber, String name, int grade, double gpa) {
		// TODO Auto-generated constructor stub
		super(schoolName, studentNumber, name, grade);
		this.gpa = gpa;
	}
	
	public double getGpa() { return this.gpa; }

	
	
	@Override
	public String toString() {
		return super.toString()+"{\n\t_10_College [gpa=" + gpa + ", getGpa()=" + getGpa() + "]\n}";
	}

	@Override
	public Object getGrade_Gpa() {
		// TODO Auto-generated method stub
		Double d = this.getGpa();
		return d;
	}
	
	
	
}
