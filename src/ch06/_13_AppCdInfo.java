package ch06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _13_AppCdInfo extends _13_CdInfo implements _13_Lendable{
	private String borrower;		// 대출인
	private String checkOutDate;	// 대출일
	private int state;				// 상태
	
	public _13_AppCdInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public _13_AppCdInfo(String registerNo, String title) {
		// TODO Auto-generated constructor stub
		super(registerNo, title);
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		if(this.state == _13_Lendable.STATE_BORROWED){
			System.out.println("================");
			System.out.println("이미 대출중입니다.");
			System.out.println("================");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		state = _13_Lendable.STATE_BORROWED;
		
		System.out.println(super.getTitle() + "이(가) 대출되었습니다.");
		System.out.println("대출인 : "+this.borrower+"\t대출일 : "+this.checkOutDate);
	
	}
	
	@Override
	public void checkIn() {		
		// TODO Auto-generated method stub
		if(this.state == _13_Lendable.STATE_NOMAL) {
			System.out.println("================");
			System.out.println("이미 반납했습니다.");
			System.out.println("================");
			return;
		}
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MMMMM.dd h:mm:ss:SSS aaaa");
		this.borrower = null;
		this.checkOutDate = null;
		this.state = _13_Lendable.STATE_NOMAL;
		System.out.println(super.getTitle()+"이(가) 반납 완료되었습니다.");
		System.out.println("반납일 : "+format.format(date));
	}

}