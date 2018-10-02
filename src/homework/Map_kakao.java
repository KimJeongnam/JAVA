package homework;

public class Map_kakao {
	int[] array1 = {9, 20, 28, 18, 11};
	int[] array2 = {30, 1, 21, 17, 28};

	char c = ' ';
	

	public void print(int[] array) {
		/*
		 * 배열은 참조변수 이므로 복사를 필히 힌다.
		 */
		int temp[] = ArrayCopy(array);
		// 시스템에서 제공하는 array copy
		/*System.arraycopy(array, 0, temp, 0, array.length);*/
		
		for(int i=0; i<temp.length; i++) {
			for(int j=0;j<5; j++) {
/*				System.out.print((array[i]&16));*/
				c = ((temp[i]&16)!=0)?'#':' ';
				System.out.print(c);
				temp[i]=temp[i]<<1;
			}
			System.out.println();
		}
	}
	
	public void Mapping(int[] temp){
		
		for(int i=0; i<5; i++) {
			temp[i] = array1[i] | array2[i];
		}
	}
	
	public int[] ArrayCopy(int[] array) {
		int[] temp = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			temp[i] = array[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Map_kakao k = new Map_kakao();
		int[] result = new int[5];
		
		System.out.println("-----Map1----");
		k.print(k.array1);
		System.out.println();
		System.out.println("-----Map2----");
		k.print(k.array2);
		
		System.out.println("-----Result----");
		k.Mapping(result);
		k.print(result);
	}

}
