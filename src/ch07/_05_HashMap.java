package ch07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_HashMap {
	private static final boolean SUCCESS = true;
	private static final boolean FAIL = false;
	private static final int MAX_USERS = 5; 
	private Map<String, String> users = new HashMap<String, String>();
	private Scanner scan = new Scanner(System.in);
	
	public _05_HashMap() {
		int i=0;
		printLine();
		while(true) {
			String[] arrays;
			String input;
			String id, pwd;
			System.out.println("프로그램 시작(종료 : exit)");
			System.out.print((i+1)+"번째 유저 id, pwd 입력 : ");
			input = scan.nextLine();
			
			if(input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(1);
			}
			
			input = input.trim();
			arrays = input.split(" ");
			
			if(arrays.length!=2) {
				System.out.println("Input Type Error !! id (공백) pwd 형식으로 입력하세요.");
				continue;
			}
			i++;
			
			
			users.put(arrays[0], arrays[1]);
			System.out.println("입력 완료 {"+arrays[0]+":"+ arrays[1]+"}");
			
			if(i>=MAX_USERS) break;
		}
		printLine();
	}
	
	public void successLogin(String id) {
		System.out.println("로그인 성공!");
		System.out.println("환영합니다. "+id +"님");
	}
	
	
	public void Login() {
		System.out.println("**** Log in! ****");
		boolean login_status = FAIL;
		
		do {
			String id;
			String pwd;
			System.out.print("id : ");
			id = scan.next();
			if(!users.containsKey(id)) {
				System.out.println("Error 입력하신 아이디가 존재하지 않습니다.");
				continue;
			}
			scan.nextLine();
			System.out.print("pw : ");
			pwd = scan.next();
			
			if(pwd.equals(users.get(id))) {
				login_status = SUCCESS;
				successLogin(id);
				return;
			}
			
			System.out.println("입력하신 패스워드가 다릅니다. 재시도....");
				
			
		}while(true);
	}
	
	public void printLine() {
		System.out.println("<=============================================>");
	}
	public static void main(String[] args) {
		/*
		 *  1. id, pwd 5건을 hash map에 저장하라.
		 *  
		 *  console로부터 id pwd를 입력받는다.
		 *  
		 *  로그인 해라
		 *   아이디가없을시 입력하신 아이디가 존재하지 않습니다. 출력
		 *   비밀번호 틀릴시 비밀번호가 다르다 출력
		 *   모두 일치시 로그인 되었습니다. id, pwd 출력
		 */
		
		
		_05_HashMap process = new _05_HashMap();
		process.Login();

	}
}


