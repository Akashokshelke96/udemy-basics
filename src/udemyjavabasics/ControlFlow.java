package udemyjavabasics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry = true; 
        if (hungry == true) {   //if ! is used before hungry , 'not' will apply and the cond. will reverse i.e false                //you can also put (2==2) which will always print 'make a soup' and skip else stm.
        	System.out.println("make a soup"); //if true it will print this 
        }else {
        	System.out.println("i am not hungry");
        	
        }
        
        int hungerrating = 5;
        if (!(hungerrating == 6)) { // () is imp here   //if we put 1 before hungerrating: then means "if hungerrating is NOT below 6, print 'you are hungry' "
        	System.out.println("you are not hungry");
        }else {
        	System.out.println("you are hungry");
        
        }
        
        
        int favtemp = 60;
        int currtemp = 12;
        
        if (currtemp>favtemp + 20) {
        	System.out.println("it is a bit hot here");
        }else if (currtemp>favtemp + 30) {
        	System.out.println("it is very very hot here");
        }else if (currtemp<favtemp -20) {
        	System.out.println("Temp is very cold here");
        }else {
        	System.out.println("Temp is at optimum level");
        	
        }//another way
        
        int favtemp1 = 100;
        int currtemp1 = 100;
		String opinion;
         
		if (currtemp1<favtemp1 - 10) {
        	opinion = "it is very cold here";
        }else if (currtemp1>favtemp1 + 10) {
        	opinion = "it is very very hot here";
        }else if (currtemp1<favtemp1 -20) {
        	opinion ="Temp is very cold here";
        }else {
        	opinion = "Temp is at optimum level";
        	
        }System.out.println(opinion);
        
        //what are the uses of "switch"
        int month = 6;
        String monthstring;
        switch (month) {
        
        case 1 : monthstring = "january";
           break;
        case 2 : monthstring = "february";
           break;
        case 3 : monthstring = "march";
           break;
        case 6 : monthstring = "june";
           break;
        default : monthstring = "unknown input";
        
        }
        System.out.println(monthstring);
	}
 
}