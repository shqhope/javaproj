package sq.thread;

public class TestThread1 extends Thread {
	public TestThread1(int iNum, String strName) {
		super.setName(strName);
	}
	@Override
	public void run() {
		int inum = 0;
		for (;;) {
			System.out.println("this is a thread printnum:" + inum++ + " threadid:" + currentThread().getName());
			try	{
				sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
}
