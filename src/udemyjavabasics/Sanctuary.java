package udemyjavabasics;

public class Sanctuary {

	public static void main(String[] args) {

		Birds Myna = new Birds("Myna",12, "rishikesh", 23426);
		
		
		Birds Sparrow = new Birds(null, 0, null, 0);
		Sparrow.name = "Sparrow Jack";
		Sparrow.left = 2423525;
		Sparrow.state = "Chhattisgarh";
		Sparrow.age = 1;
		
		Birds Lingur = new Birds(null, 0, null, 0);
		Lingur.name = "Lingur";
		
		Sparrow.sayit();
		
		Myna.sayit();
		
		Birds bird1 = new Birds(null, 0, null, 0);
	    Birds bird2 = new Birds(null, 0, null, 0);	
	    
	    bird1.sayit();
	    
		
	}
	    
	    
	    
	    
	   
	    

}
