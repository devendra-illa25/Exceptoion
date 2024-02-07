package SDET;

public class UnCheckedException {
	
	public static void main(String[] args) {
	
		//Arithmetic exception
		int a=20;
		//System.out.println(a/0);
		
		//NullPoniter
		String s=null;
		//System.out.println(s.length());
		
		//Number Format exce
//		String st="12345";
//		int i= Integer.parseInt(st);
//		System.out.println(i); // no excep
		
//		String st="abced";
//		int i= Integer.parseInt(st);
//		System.out.println(i);
		
		//ArrayIndexOutOfBound exception
		
		int arr[]=new int[5];
		arr[10]=100;
		
		
	}
}
