package ch05;

public class _04_EmployeeMainEx {
	public static void main(String[] args) {
		/*_03_Sawon sawon = new _03_Sawon();
		sawon.setSabun("2018010001");
		sawon.setName("불쌍이");
		sawon.setAddress("서울역 3번출구앞 첫번째 밴치");
		sawon.setSalary(500000);
		sawon.setSudang(20000);
		sawon.printInfo();
		
		System.out.println("==============빈 부 격 차============");
		_03_Manager manager = new _03_Manager();
		manager.setSabun("2018010002");
		manager.setName("꼬우면 매니져 하던가");
		manager.setAddress("서울 삼성동 이하 생략");
		manager.setSalary(9000000);
		manager.setBonus(1500000);
		manager.printInfo();*/
		
		_04_Manager manager = new _04_Manager("2018010001",
											"홍길동",
											"서울특별시 강남구 니꼴리는대로",
											90000000, 
											1500000);
		
		manager.printInfo();
		
		System.out.println();
		_04_Sawon sawon = new _04_Sawon("2018010002",
										"불쌍이", 
										"전라남도 여수시 신기동 142-2",
										500000,
										20000);
		sawon.printInfo();
	}
}
