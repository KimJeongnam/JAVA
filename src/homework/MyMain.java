package homework;

public class MyMain {
	public static int add(int n1) {
		if(n1 <= 1){
			return n1;
		}else {
			/*System.out.println((n1-1)+","+(n1-2));*/
			return add(n1-1)+add(n1-2);
		}
	}
	public static void main(String[] args) {
		System.out.println();
		
		int result;
		int sum =0;
		int i=0;
		while(true) {
			result = MyMain.add(i++);
			if(result%2 ==0)
				sum += result;
			if(result>=4000000)
				break;
		}
		System.out.println(sum);
	}
}
