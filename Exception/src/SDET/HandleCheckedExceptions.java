package SDET;

public class HandleCheckedExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		try {
		Thread.sleep(4000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
