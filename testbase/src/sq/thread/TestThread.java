package sq.thread;

public class TestThread extends Thread {
	private int m_iNum;
	public TestThread(int iNum) {
		m_iNum = iNum;
	}
	@Override
	public void run() {
		int inum = 0;
		for (;;) {
			System.out.println("this is a thread printnum:" + inum++ + " threadid:" + m_iNum);
			try	{
				sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
}
