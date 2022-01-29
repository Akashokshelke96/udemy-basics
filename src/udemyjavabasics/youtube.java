package udemyjavabasics;

import java.util.Scanner;

public class youtube {

	public static void main(String[] args) {
//int numa = 20 , numb = 10;
//numa *=10;
//numa /=2;
//System.out.println(numa);
//numa = ++numa;
//numb = --numb;  //this will give 10 - 1 = 9
//System.out.println(numb);

/* comparision operator 
 * 1. == checks for equality of two values. returns true or false
 * 2. != checks if two values are not equal.
 * 3. <
 * 4. >
 * 5. <=
 * 6. >=
 */

/*Logical operators
 * 1. && logical and operator; returns true only if both the conditions are true.
 * 2. || logical or operator ;returns true if even one of the conditions are true.
 * 3. !  logical not operator ; reverses the result from true to false and vice versa
 */

 //Taking input
//
//Scanner scan = new Scanner(System.in);
// System.out.println("enter input");
// int input = scan.nextInt(); //this will only take the first word of the line to print but if want full line then add "nextline"
// System.out.println(input);
// 
// String male = "akash";
// String female = "nishu";
// System.out.println(male + " weds " + female);
// System.out.println(male.length());  //this will print number the alphabets in assigned value here 5.
// 
 
	Scanner scan  = new Scanner(System.in);
	System.out.println("enter your number");
    int number = scan.nextInt();
    
    switch (number) { //a program to tell which day it is with number as input.
    
    case 1:
    	System.out.println("Sunday");
       break;
    case 2:
        System.out.println("Monday");
       break;
    case 3:
    	System.out.println("Tuesday");
    	break;
    case 4:
    	System.out.println("Wednuesday");
    	break;
    case 5:
    	System.out.println("Thursday");
    	break;
    case 6:
    	System.out.println("Friday");
    	break;
    case 7:
    	System.out.println("Saturday");
    	break;
    	
    default : 
    	System.out.println("Your input is invalid ");
    
    
    
    }
    
    
	}

}
