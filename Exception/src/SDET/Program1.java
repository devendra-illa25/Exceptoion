package SDET;

public class Program1 {

	public static void main(String[] args) {
	
		//Checked exceptions 
		System.out.println("Started");
		
		//Thread.sleep(4000); //InterruptedException
		
//UnChecked exceptions 
		int i=10;
		System.out.println(i/0);
		
		System.out.println("Stopped");
		}
}
