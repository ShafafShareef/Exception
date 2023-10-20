package exception1;

public class TryCatchSample2 {
	public void aaa() {
		try {
		int a[]= {1,2,3,4,5};
		System.out.println(a[5]);
		}
//		catch(Exception obj) {
//			System.out.println("It is already handled by the catch block for Exception");
//		}  
		// this can handle all type of exception,so the following catch block will be error.
		
		catch(ArithmeticException ob1) {
			System.out.println("ArithmeticException Handled");
		}
		// here its ArrayIndexOutOfBoundsException so this will not work.
		catch(ArrayIndexOutOfBoundsException ob2) {
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}
		// here its ArrayIndexOutOfBoundsException so it will work.
		catch(Exception obj) {
			System.out.println("It is already handled by the catch block for Exception");
		}
		// ArrayIndexOutOfBoundsException alredy executed so will not work, but no error.
	}
	public static void main(String args[]) {
		TryCatchSample2 ob = new TryCatchSample2();
		ob.aaa();
	}
}
