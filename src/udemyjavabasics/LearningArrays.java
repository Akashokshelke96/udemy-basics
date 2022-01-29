package udemyjavabasics;

public class LearningArrays {

	public static void main(String[] args) {
        int values;
        values = 100;
        //to store multiple values = arrays
        int []value1 = new int [100]; //value1 arrays now has 100 slots 0-99
        value1[2] = 1000; //here the value in bracket is the INDEXING value in the 100 slots mentioned above
	    value1[99] = 2002;
	   // value1[23] = 33.44; //floats can be used only if we can use double instead of int
	    System.out.println(value1[1]); //empty slots with will show 0 as empty
	    System.out.println(value1[99]);
	  //  System.out.println(value1[100]); //does not exist as 100= 99 at indexing since starts with zero
	    
	    
	    String [] words = new String[] {"my","name", "is gonzaliz"}; //words is an array of size 3
	    System.out.println(words[2]);
	    
	    String [] life = new String[5]; //string arrays variable = new string [slots containing] 
	    life[0]= "mom";
	    life[1]= "family";
	    life[2]= "job";
	    life[3]= "nishu";
	    System.out.println(life[3]);
	    //you cannot change the number of slots later for a variable, but you can;
	    life = new String[10];
	    //this way you have created a new slots container named 'life' with EMPTY 10 slots,old data gone
	    System.out.println(life[0]); //will show null as there is no value inside.
	    
	    
	    
	    		
	    
	    
	    
	    
	    
	    
	
	
	
	
	}

}
