package udemyjavabasics;

public class MethodsImportant { 
  
	public static void main(String[] args) {
	
	System.out.println("akashshelke");
	MyUtils1 util = new MyUtils1();
	util.printsomejunk("i am cool"); //here printsomejunk is not defined in this class, it is defined in the MyUtils1 class
}  
	public static void sum2numbers(int first, int second) {
		System.out.println(first + second);
		
	}
	public static int add10(int someA) {  //return works when both are of the same data type.
		int result = someA + 10;
		return result;
	}
	    
	
}

