package sq.thread;

public class TestThread2 implements Runnable {
	private int m_iCounter;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (;;)
		{
			System.out.println("runnable thread id:" + Thread.currentThread().getName() + " counter:" + m_iCounter++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
