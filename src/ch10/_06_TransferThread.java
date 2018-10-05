package ch10;

//계좌이체 thread
public class _06_TransferThread implements Runnable{
	
	private _06_SharedArea sharedArea;
	
	public _06_TransferThread(_06_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<12; i++) {
			sharedArea.transfer(i+1, 1000000);
		}
	}
	
}
