package ch10;

import java.util.Random;

public class _05_VoteThread implements Runnable {
	StringBuffer sb = new StringBuffer();
	int sum = 0, targetNum=100;
	Random random = new Random();

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			sum += random.nextInt(10);;
			sb.delete(0, sb.toString().length());

			if (sum >= targetNum) {
				sum = 100;
				for (int i = 0; i < sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + "개표율 : " + sum + "\t" + sb);
				sum = 0;
				break;
			} else {
				for (int i = 0; i < sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + "개표율 : " + sum + "\t" + sb);
			}
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
