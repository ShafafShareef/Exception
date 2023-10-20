package exception1;

public class TryCatchSample {
	public void div() {
		int a = 10;
		int b = 0;
		try {
		int result = a/b;
		System.out.println(result);
		}
		catch(ArithmeticException o) {
			System.out.println("handled ");
		}
	}
	public static void main(String args []) {
		TryCatchSample o = new TryCatchSample();
		o.div();
	}
}
