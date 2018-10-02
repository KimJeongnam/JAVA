package ch06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _13_Main {
	public static void main(String[] args) {
		_13_AppCdInfo appCD = new _13_AppCdInfo("1004", "내 머리속의 지우개");
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MMMMM.dd h:mm:ss:SSS aaaa");
		appCD.checkOut("홍길자", format.format(date));
		appCD.checkOut("홍길자", format.format(date));
		appCD.checkIn();
		appCD.checkIn();
	}
}
