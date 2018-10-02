package ch02;

public class _08_ForEx05 {
	public static void main(String[] args) {
		/*
		 * 
		 */
		String str = "no pain no gain";
		int cnt = 0;
		
		for(int i=0; i<str.length();i++) {
			//  str에서 '0' 가 아니면 continue
			if(str.charAt(i) != 'o') continue;
			cnt++;
		}
		System.out.println(str.length());
		System.out.println(cnt);
		
	}
}
