package ch06;

public class _09_InterfaceEx {
	public static void main(String[] args) {
		A10 a = new A10();
		a.autoPlay(new B10());
		a.autoPlay(new C10());
	}
}

class A10{
	public void autoPlay(I10 i10) {
		i10.play();
	}
}

interface I10{
	public void play();
}


class B10 implements I10{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("다같이놀자 동네한바퀴~");
	}
	
}

class C10 implements I10{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("장난감 기차가 칙칙 폭폭 간다.");
	}
	
}