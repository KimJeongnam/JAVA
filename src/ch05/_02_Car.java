package ch05;

public class _02_Car {
	private String kind;
	private int speed;
	
	public _02_Car() {
		
	}
	
	public void print() {
		System.out.println("kind : "+kind+"\nspeed : "+speed);
	}
	
	public void Uturn() {
		System.out.println("u턴 하다.");
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
