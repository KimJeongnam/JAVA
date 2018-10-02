package test;

import java.util.Scanner;

public class Sungjuk{
	private int java;
	private int jsp;
	private int spring;
	
	//생성자
	public Sungjuk(){
		// default
	}
	
	public Sungjuk(int java, int jsp, int spring){
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
	}

	// getInfo()
	public void getInfo(){
		System.out.printf("Java : "+ this.java
				+"\nJsp : "+this.jsp
				+"\nSpring : "+this.spring
				+"\n총점 : "+getTotal()
				+"\n평균 : %2.2f"
				+"\n학점 : "+getGrade()+"\n", getAvg());
	}
	
	// Methods
	public int getTotal(){ return this.java+this.jsp+this.spring; }
	
	public double getAvg(){ return (double)getTotal()/3.0; }
	
	public char getGrade(){
		char c = 'F';
		
		switch((int)getAvg()/10){
		case 10:
		case 9:
			c = 'A';
			break;
		case 8:
			c = 'B';
			break;
		case 7:
			c = 'C';
			break;
		case 6:
			c = 'D';
			break;
		}
		return c;
	}
	
	//Getter&Setter
	public void setJava(int java){ this.java = java; }
	public int getJava(){ return this.java; }

	public void setJsp(int jsp){ this.jsp = jsp; }
	public int getJsp(){ return this.jsp; }

	public void setSpring(int spring){ this.spring = spring; }
	public int getSpring(){ return this.spring; }


	//  메인함수
	public static void main(String[] args){
		Sungjuk sungjuk = new Sungjuk();
		
		Scanner input = new Scanner(System.in);

		System.out.println("=======기본생성자 + setter getter=========");
		System.out.print("성적을 입력하세요 Java :");
		sungjuk.setJava(input.nextInt()); 
		System.out.print("성적을 입력하세요 Jsp :");
		sungjuk.setJsp(input.nextInt());
		System.out.print("성적을 입력하세요 Spring :");
		sungjuk.setSpring(input.nextInt());

		sungjuk.getInfo();

		System.out.println("=======매개변수 생성자=========");
		Sungjuk s2 = new Sungjuk(80, 70, 90);

		s2.getInfo();
		
		input.close();
	}
}