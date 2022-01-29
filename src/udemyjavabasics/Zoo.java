package udemyjavabasics;
import udemyjavabasics.Animals;

public class Zoo {

	public static void main(String[] args) {
    
		Animals Lion = new Animals(null, 0, null, 0);
        Lion.name = "Lion";
        Lion.age = 20;
        Lion.lifesp = 2;
        Lion.sex = "Male";
	    
        Lion.tellme();
        
        Chicken chick1 = new Chicken();
        
        
        
        	
        Animals Deer = new Animals("Deer", 12, "male", 3414);
        Deer.running();
        
        
        Deer.tellme();
        
        
        Animals Croc  = new Animals(null, 0, null, 0);
        Croc.name = "Crocodile";
        Croc.age = 12;
        Croc.sex = "female";
        Croc.lifesp = 100;
        
        Animals Tiger = new Animals(null, 0, null, 0);
        Tiger.name = "Tiger";
        Tiger.age = 12;
        Tiger.sex = "male";
        Tiger.lifesp = 2;
	
        Tiger.tellme();
        Croc.tellme();
        Croc.killing();
        
        Animals animal1 = new Animals("animal1", 12,"male",23);
        
        Birds bird1 = new Birds("bird1", 12,"female",24);
        bird1.sayit();
        
        
        
        
        
        
        
        
	}
	
	
	
}
       
        

