package SDET;

public class HandleUncheckedExceptions {

	public static void main(String[] args) {
		System.out.println("Program is started");
		int a=20;
		try {
		System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program is in progress");
		System.out.println("Program is completed");
		
	}

}
