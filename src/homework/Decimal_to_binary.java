package homework;

public class Decimal_to_binary {
	private int decimal;
	private String binary;
	private String octal;
	private String hexa;

	private final int BIT_SIZE = 32;

	public Decimal_to_binary() {
		// TODO Auto-generated constructor stub
	}

	public void decimalToBinary() {
		String result = "";

		if (this.decimal <= 0) {
			System.out.println("Plz set Decimal");
			return;
		}

		int d = this.decimal;
		int mask = 1;

		for (int i = 0; i < BIT_SIZE; i++) {
			if (i % 4 == 0 && i != 0)
				result += ' ';
			result += ((d & mask) == 1) ? '1' : '0';
			d = d >> 1;
		}
		this.binary = reverseString(result);
		/* return getBinary(); */
	}

	// decimal to octal
	public void decimalToOctal() {
		if (this.decimal <= 0) {
			System.out.println("Plz set Decimal");
			return;
		}

		int mask = 7;
		int temp = this.decimal;
		String buf = "";

		for (int i = 0; i < 9; i++) {
			int result = temp & mask;
			buf += Integer.toString(result);
			temp = temp >> 3;
		}
		this.octal = reverseString(buf);
	}

	public void decimalToHexa() {
		if (this.decimal <= 0) {
			System.out.println("Plz set Decimal");
			return;
		}
		int mask = 15;
		int temp = this.decimal;
		String buf = "";
		for (int i = 0; i < 8; i++) {
			if (i % 4 == 0 && i != 0)
				buf += ' ';
			int result = temp & mask;
			switch (result) {
			case 15:
				buf += 'F';
				break;
			case 14:
				buf += 'E';
				break;
			case 13:
				buf += 'D';
				break;
			case 12:
				buf += 'C';
				break;
			case 11:
				buf += 'B';
				break;
			case 10:
				buf += 'A';
				break;
			default:
				buf += Integer.toString(result);
				break;
			}
			temp = temp >> 4;
		}
		this.hexa = reverseString(buf);
	}

	private String reverseString(String target) {
		String buf = new String();

		// 0~1
		for (int i = target.length() - 1; i >= 0; i--)
			buf += target.charAt(i);
		return buf;
	}

	// Getter && Setter
	public int getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}

	public String getBinary() {
		decimalToBinary();
		return binary;
	}

	public void setBinary(String binary) {
		this.binary = binary;
	}

	public String getOctal() {
		decimalToOctal();
		return octal;
	}

	public void setOctal(String octal) {
		this.octal = octal;
	}

	public String getHexa() {
		decimalToHexa();
		return hexa;
	}

	public void setHexa(String hexa) {
		this.hexa = hexa;
	}

	public static void main(String[] args) {
		Decimal_to_binary d = new Decimal_to_binary();

		d.setDecimal(2147483647);
		System.out.println("setDecimal() : " + d.getDecimal());
		System.out.println("get Binary() : " + d.getBinary());
		System.out.println("getOctal() : " + d.getOctal());
		System.out.println("get Hexa() : " + d.getHexa());

		d.setDecimal(31);
		System.out.println("setDecimal() : " + d.getDecimal());
		System.out.println("get Binary() : " + d.getBinary());
		System.out.println("getOctal() : " + d.getOctal());
		System.out.println("get Hexa() : " + d.getHexa());
	}
}
