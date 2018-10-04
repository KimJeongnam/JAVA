package ch08;

public class _08_InvlidMemberException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int worgAge;
	private String worgName;
	
	public _08_InvlidMemberException() {}

	public _08_InvlidMemberException(int worgAge) {
		this.worgAge = worgAge;
		System.err.println("나이는 0이상인 양수입니다.");
		showWorgAge();
	}

	public _08_InvlidMemberException(String worgName) {
		this.worgName = worgName;
		System.err.println("이름은 2글자 이상입니다.");
		showWorgName();
	}
	
	public int getWorgAge() {return this.worgAge; }
	public String getWorgName() { return this.worgName; }
	
	public void showWorgName() {
		System.err.println("잘못 입력된 이름 : "+getWorgName());
	}
	public void showWorgAge() {
		System.err.println("잘못 입력된 나이 : "+getWorgAge());
	}
}
