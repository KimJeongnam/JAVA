package ch07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class _06_HashMapEx {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		map.put("하늘", "sky");
		map.put("사과", "Apple");
		map.put("학교", "School");
		map.put("포도",  "Grape");
		map.put("바나나",  "Banana");
		
		while(true) {
			_06_HashMapEx.printDict(map);
			System.out.print("찾으실 단어를 입력하세요 (quit : 'q') :");
			String str = scan.nextLine().toLowerCase().trim();
			
			if(str.isEmpty()) {
				str = scan.nextLine();
			}
			
			if(str.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				return;
			}
			
			if(map.containsKey(str)) {
				System.out.println(str+" = "+map.get(str));
			}else {
				System.out.println("목록에 없는단어 입니다.");
			}
			
		}
	}
	
	public static void printDict(Map<String, String> map) {
		System.out.print("입력된 단어 목록 .. {");
		for(String str: map.keySet()) {
			System.out.print(str+" ");
		}
		System.out.print("}\n");
	}
}
