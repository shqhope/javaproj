package sq.single;

public class TestSingle {
	
	/**
	 * @author sdzw
	 * 线程安全
	 */
	public static class Single1{
		private static Single1 instance = null;
		public static Single1 GetInst() {
			if (instance == null) {
				synchronized (Single1.class) {
					if (instance != null) {
						return instance;
					}
					Single1 inst = new Single1();
					instance = inst;
				}
			}
			return instance;
		}
	}
	
	/**
	 * @author sdzw
	 * 线程不安全
	 */
	public static class Single2{
		private static Single2 instance = null;
		public static Single2 GetInst() {
			if (instance == null) {
				Single2 inst = new Single2();
				instance = inst;
			}
			return instance;
		}
	}
}
