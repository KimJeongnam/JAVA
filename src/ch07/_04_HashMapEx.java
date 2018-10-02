package ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _04_HashMapEx {
	public static void main(String[] args) {
		Map<String, _04_Student> map  = new HashMap<String, _04_Student>();
		
		map.put("H001", new _04_Student(1, "김동주"));
		map.put("H002", new _04_Student(2, "노재미"));
		map.put("H003", new _04_Student(3, "빅재미"));
		map.put("H004", new _04_Student(4, "동해"));
		
		for(String str : map.keySet()) {
			_04_Student std = (_04_Student)map.get(str);
			System.out.println("key : "+str+", Info : "+std.toString());
		}
		System.out.println("==========================================");
		map.remove("H002");

		for(String str : map.keySet()) {
			_04_Student std = (_04_Student)map.get(str);
			System.out.println("key : "+str+", Info : "+std.toString());
		}System.out.println("==========================================");
		
		// 하나 추가 h003
		
		map.put("H003", new _04_Student(2, "이정섭"));
		
		/*
		 *  Entry 인터페이스는 하나의 key와 하나의 value를 가지고있다.
		 */
		for(Map.Entry<String, _04_Student> str : map.entrySet()) {
			if(str.getKey().equals("H001")) {
				map.remove("H001");
				break;
			}
		}
		
		for(Map.Entry<String, _04_Student> str : map.entrySet()) {
			System.out.println("key : "+str.getKey()+", Info"+str.getValue().toString());
		}
		
	}
}
