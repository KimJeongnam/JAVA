package ch04;

public class _06_GetSetterMainEx {
	public static void main(String[] args) {
		_06_GetSetter ppang = new _06_GetSetter("단팥빵", 1500, "이성당");
		ppang.printInfo();

		/*
		 * _06_GetSetter ppang2 = new _06_GetSetter("소보루", 1500, "빠바");
		 * ppang2.printInfo();
		 */

		// GetterSetter
		ppang.setName("바게트");
		ppang.setPrice(3500);
		ppang.setBrand("빠바");

		System.out.println("Getter() 이름 : " + ppang.getName());
		System.out.println("Getter() 가격 : " + ppang.getPrice() + "원");
		System.out.println("Getter() 브랜드 : " + ppang.getBrand());
	}
}
