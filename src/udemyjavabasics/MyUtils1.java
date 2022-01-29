package udemyjavabasics;

public class MyUtils1 {
	public static void main(String[] args) {  //this is how we make methods here main is method we can use anything else and add (data type .....)
		System.out.println("i am a goof"); //here println (method) and we are giving "i am a goof" as an arguement to method.
	//	printsomejunk("this is a good idea");  //we can leave it blank if we used variable in line below
	
	
	}
	public void printsomejunk(String arguement) {  //here arguement as a variable is assigned to the value 'this is a good idea"
		System.out.println("some bla bla bla " + arguement);

		
		MethodsImportant.sum2numbers(10 , 20); //here since the 'void' is used it cannot return value but line below we have put return in the methodsimportant.java
	
		int myvar = MethodsImportant.add10(88); //we captured the returned value from other class
		System.out.println(myvar);
		
	    
		
	}
}
	
