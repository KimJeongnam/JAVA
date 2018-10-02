package test;

public class _01_BankMainEx {
	public static void main(String[] args) {
		System.out.println("=====기본 생성자 + Getter&Setter====");
		_01_WooriBank woori = new _01_WooriBank();
		woori.setBankName("우리은행");
		woori.setAccountNumber("1002-248-720222");
		woori.setCustomer("김정남");
		woori.setBalance(0);
		woori.setInterestRate(2.5);
		woori.printBanckInfo();
		
		System.out.println();
		_01_KaKaoBank kakao = new _01_KaKaoBank();
		kakao.setBankName("카카오은행");
		kakao.setAccountNumber("110-313-554999");
		kakao.setCustomer("김정남");
		kakao.setBalance(25000);
		kakao.setLoanRate(4.5);
		kakao.printBanckInfo();
		System.out.println("================================");
		
		System.out.println("\n=========매개변수 생성자===========");
		_01_WooriBank woori1 = new _01_WooriBank("우리은행1", "1002-248-720222","김정남", 0, 2.5);
		woori1.printBanckInfo();
		System.out.println();
		
		_01_KaKaoBank kakao1 = new _01_KaKaoBank("카카오은행1", "110-313-554999", "김정남", 25000, 4.5);
		kakao1.printBanckInfo();
		System.out.println("================================");
	}
}
