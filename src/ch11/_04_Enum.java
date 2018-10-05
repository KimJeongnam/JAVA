package ch11;

enum Animal{
	CAT, DOG, EGLE
}

public class _04_Enum {
	private Animal kind;
	private String name;
	
	public _04_Enum() {	}
	
	public _04_Enum(Animal kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
	public Animal getKind() {
		return kind;
	}

	public void setKind(Animal kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
