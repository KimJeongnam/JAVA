package ch09;

public class _05_StringBuffer {
	public static void main(String[] args) {
		/*
		 * StringBuffer  문자열 을 추가하거나 변경할때 주로 사용한다.
		 *  - 추가 append()  
		 *  - 삽입  insert(시작위치, 문자열) : 특정 위치에 원하는 문자열 삽입.................
		 *  - subString(시작위치, 끝위치) : 시작위치부터 끝위치까지의 문자열을 반환한다.
		 *  	인덱스 0 부터 시작, 끝위치는  실제위치 -1;
		 *  - toString() : 메소드를 이용하여 String 형으로 변경한다.
		 *  
		 */
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("절박함");
		sb.append("이 기적을");
		sb.append(" 만들어잡순다");

		sb.insert(0, "간절한 ");
		System.out.println(sb.toString());
		
		System.out.println(sb.substring(0, 3));
		System.out.println(sb.substring(4, 7));
		
	}
}
