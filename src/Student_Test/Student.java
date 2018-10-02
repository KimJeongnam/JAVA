package Student_Test;

public class Student {

	int id ; // 학생번호
	String name ; // 이름
	int subnum ; //과목수
	Test[] test ; //과목
	public Student(int id, String name, int subnum) {

		this.id = id;
		this.name = name;
		this.subnum = subnum;
		test = new Test[subnum];
             // 코드 추가 필요
		for(int i=0; i<subnum;i++) {
			test[i] = new Test();
		}
	}
	
	
	String getName() {
		return this.id + ":"+this.name ;
	}
	
	// 성적을 가져옴.
	int getGrade() {
		int sum = 0 ;

 //          코드 추가 필요
		for(int i=0; i<subnum; i++) {
			sum += test[i].point;
		}

		return sum ;
	}
	
	//성적 표시 메소드
	void printScore() {
		System.out.println(getName()) ;
		System.out.println("국어 : "+test[0].getPoint());
		System.out.println("영어 : "+test[1].getPoint());
		System.out.println("수학 : "+test[2].getPoint());
		System.out.println("총점 : "+getGrade());
		for(int i=0; i<20; i++)
			System.out.print("*");
		System.out.println();
	}
}