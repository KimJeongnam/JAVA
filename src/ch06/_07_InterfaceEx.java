package ch06;

public class _07_InterfaceEx {
	public static void main(String[] args) {
		A a = new A();
		B b1 = new B("B1");
		B b2 = new B("B2");
		a.methodA(b1);
	}
}

class A{
	public void methodA(B b) {
		System.out.println("A클래스 - methodA()");
		b.methodB();
	}
}

class B{
	String name = "";
	
	public B(String name) { this.name = name; }
	public void methodB() {
		System.out.println("B클래스 - methodB()  "+ name);
		/*c.methodC();*/
	}
}

/*class C{
	String name = "";
	
	public C(String name) { this.name = name; }
	public void methodC() {
		System.out.println("C클래스 - methodC()");
	} 
}*/