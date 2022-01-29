package udemyjavabasics;

public class MyUtils {
  
	public static void printsomejunk(String args) {    //line 7 it can also accept strings since we have allowed here. 
		System.out.println("some bla bla bla " + args);
	} 
	public static void printsomejunk(int args) {   //since we have also mentioned that args can also be an 'int' L7 can now take int as arguement
		System.out.println("here i am an integer " + args);
	}                                           //java knows which one to use from given two since the value is an int.
	public static void sum2numbers(int first,int second) {
		System.out.println(first + second); //we can also make it like the cases add10 below and make the value returnable and catching it in another class by assigning it to a variable.
		
	}
	public static int add10(int somearg){ //void is not meant to return values therefore we have to use int here before add10
		int result = somearg+10;
		return result;  //till here we ahve not asked the code to print the result yet..
    }
	public static String printsomejunk1(String arguement) { //
    String Ak47 = arguement + " shelke";
	return Ak47;
	
	}
	
	
}
