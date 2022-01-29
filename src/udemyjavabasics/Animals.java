package udemyjavabasics;

public class Animals {
    String name;
	int age;
	String sex;
    int lifesp;
	
	
	public Animals(String name, int age, String sex, int lifesp) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.lifesp = lifesp;
	}
	
	public void tellme() {
    	System.out.println("Hello I am a " +name);
    	System.out.println("I am " + age +" years old");
    	System.out.println("I am a " + sex);
    	System.out.println("I have only " +lifesp + " years remaining");
    	
    }
	public void  running () {
		System.out.println("i can run fast");
	}	
	public void  killing () {
		System.out.println("i kill many in a day");
	}
	
	
	 
}


      



