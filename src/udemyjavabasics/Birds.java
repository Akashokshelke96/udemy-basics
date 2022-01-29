package udemyjavabasics;

public class Birds extends Animals {
	public Birds(String name, int age, String sex, int lifesp) {
		super(name, age, sex, lifesp);
	}

	String name;
	String state;
	int age;
	int left;
	
		
	public void sayit() {
	
		System.out.println("i am a " + name + " i can fly");
		System.out.println("i live in "+ state);
		System.out.println("i am  "+ age +" years old");
		System.out.println("we are only "+ left + " left in this world");
	
	}
	
	
	
}
