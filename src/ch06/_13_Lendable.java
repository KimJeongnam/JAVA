package ch06;

public interface _13_Lendable {
	public static final int STATE_BORROWED = 1;	// 대출중
	public static final int STATE_NOMAL = 0; 	// 비대출
	
	public void checkOut(String borrower, String date);
	public void checkIn();
}
