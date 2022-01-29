package udemyjavabasics;

import testpackage.Example;

public class LearningMethods {

	public static void main(String[] args) {  //void type is not returnable
       System.out.println("akash kumar shelke");         //println here is the method, and name is the arguement 
	   MyUtils.printsomejunk(25);  //since it is defined in the MyUtils class it can be called here. 
	   MyUtils.sum2numbers(10,25); //here in the myutils class the datatype void is not returnable 
	   
	   int myvar =  MyUtils.add10(99); //here we have caught the return value mentioned in the  Myutils class but assignning it to a variable
	   System.out.println(myvar);  //now when we want to print that variable we just get the variable it is assign
	
	   String var1 = MyUtils.printsomejunk1("akash");
	   
	   System.out.println(var1);
	   String name = Example.dosomething("hello ");
	   System.out.println(name);
	 
	// MyUtils.add10(100); //will not work when i remove the word STATIC in my utils class.
       // removing static word means the add10 is in that class's INSTANCE only and not the class itself i.e MyUtils
	  // MyUtils myvar; //yes we can also use class as the datatype to reach the INSTANCE of that class to use all the NON STATIC ones from that class too
     // myvar = new MyUtils();
       
       int Hereme = Mytest1.PrintMe(25, 15);
       System.out.println(Hereme);
	}
	
	
	


}
   