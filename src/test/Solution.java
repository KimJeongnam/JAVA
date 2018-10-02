package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] args1 = { "mislav", "stanko", "mislav", "ana" }; /* {"leo", "kiki", "eden"}; */
		String[] args2 = { "stanko", "ana", "mislav" }; /* {"eden", "kiki"}; */
		String[] phone_book = { "911", "97625999", "91125426" };
		Solution s = new Solution();

		System.out.println(s.solution(args1, args2));

		s.solution2(phone_book);
		System.out.println("\n");
		
		s.test();
	}
	public void test() {
		String[] args = {"12","123","1235","567","88"};

		Set<String> set = new HashSet<String>();
		
		for(String str : args){
			set.add(str);
		}
		
		for(String str: set) {
			System.out.println(str);
		}
	}
	public boolean solution2(String[] phone_book) {
		boolean answer = true;
	/*	Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String str : phone_book)
			map.put(str, str.length());*/
		
		for(String str : phone_book) {
			int len = str.length();
			for(String key : phone_book) {
				if(key.length()<=len) {
					continue;
				}else {
					if(key.contains(str)){
						return false;
					}
				}
			}
		}
		
		/*for(String str : phone_book) {
			for(String key : map.keySet()) {
				if(key.length()<=str.length()) {
					continue;
				}else {
					if(key.contains(str))
						return false;
				}
			}
		}
		*/
		return answer;
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : completion) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
				continue;
			}
			map.put(str, 0);
		}
		for (String str : participant) {
			if (map.containsKey(str)) {
				int n = map.get(str);
				if (n < 0) {
					answer = str;
					System.out.println(answer + "는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.");
				}
				map.put(str, n - 1);
			} else {
				answer = str;
				System.out.println(answer + "는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.");
				break;
			}
		}

		return answer;
	}
	/*
	 * public String solution1(String[] participant, String[] completion) { String
	 * answer = ""; HashMap<Integer, String> map = new HashMap<Integer ,String>();
	 * int key = -1; boolean same = false;
	 * 
	 * for(int i=0; i<participant.length; i++){ map.put(i, participant[i]); }
	 * 
	 * for(int i=0; i<completion.length; i++){ for(int j=0; j<map.size(); j++){
	 * if(completion[i].equals(map.get(j))) { map.remove(j); } } } for(int i=0;
	 * i<participant.length; i++) { if(map.get(i)!= null) { key = i; break; } }
	 * answer = map.get(key); for(int i=0; i<completion.length; i++) {
	 * if(completion[i].equals(map.get(key))) same=true; }
	 * 
	 * if(same) { System.out.println(
	 * answer+"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다."); }else {
	 * System.out.println(answer+"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다."); }
	 * return answer; }
	 */
}
