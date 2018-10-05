package ch07;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_ArrayLIstEx {
	public static void main(String[] args) {
		/*
		 * 검색 : list.indexOf(검색할 값); ==> 리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를
		 * 리턴한다.
		 * 
		 * list.lastIndexOf(검색할 값); ==> 리스트에서 검색할 값과 똑같은 값을 갖는 마지막 데이터를 찾아서 그 위치의 인덱스를
		 * 리턴한다. 검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 */
		ArrayList<String> hobbys = new ArrayList<String>();

		hobbys.add("헬스");
		hobbys.add("게임");
		hobbys.add("수영");
		hobbys.add("영화");
		hobbys.add("독서");
		hobbys.add("잠자기");
		hobbys.add("누워있기");
		hobbys.add("헬스");

		Iterator<String> it = hobbys.iterator();

		// 반복문 도중 해당 데이터 삭제시 Iterator 를 사용한다.
		while (it.hasNext()) {
			String str = it.next();
			if (str.equals("잠자기"))
				it.remove();
		}

		for (String str : hobbys) {
			System.out.println(str);
		}

	}
}
