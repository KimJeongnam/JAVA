package ch05;

public class _07_CallbyValue_Reference {
	int value;
	
	public void inc(int a) {
		a+=1;
		System.out.println("inc()\n"+a);
	}
	
	public void CallByReference_Class(_07_CallbyValue_Reference obj) {
		obj.value += 1;
		System.out.println("cbr()");
	}
	
	public void CallByReference_Array(String[] arg) {
		if(arg == null) {
			return;
		}
		arg[0] = "hello";
		System.out.println("CallByReference_Array()");
	}
	public static void main(String[] args) {
		_07_CallbyValue_Reference a = new _07_CallbyValue_Reference();
		
		
		int num = 10;
		a.inc(num);
		System.out.println("---CallByValue---");
		System.out.println("num : "+num);
	
		System.out.println("\n---CallByReference(Class)---");
		
		System.out.println("before : "+a.value);
		a.CallByReference_Class(a);
		System.out.println("after : "+a.value);
	
		String[] strs = {"hi", "my", "name", "is", "wtf", "lol"};
		
		System.out.println("\n---CallByReference(Array)--");
		System.out.print("strs : " );
		for(String str : strs) System.out.print(str+" ");
		System.out.println();
		a.CallByReference_Array(strs);
		System.out.print("strs : " );
		for(String str : strs) System.out.print(str+" ");
		System.out.println();
	}
}
