package ch10;

public class _06_PrintTotalThread implements Runnable {
	private _06_SharedArea sharedArea;

	public _06_PrintTotalThread(_06_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println("총액 : " + sharedArea.getTotal());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
