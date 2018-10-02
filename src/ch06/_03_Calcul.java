package ch06;

public class _03_Calcul extends _03_Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] array) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=0; i<array.length; i++) {
			total += array[i];
		}
		return (double)total/array.length;
	}

	public static void main(String[] args) {
		_03_Calcul cal = new _03_Calcul();
		int array[] = {2,3,4};
		
		System.out.println(cal.add(4, 2));
		System.out.println(cal.subract(4, 2));
		System.out.println(cal.average(array));
	}
}
