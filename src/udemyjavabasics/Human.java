package udemyjavabasics;

public class Human { // objects do all the work

	 String name;
	 int age;
	 int height;
     String eyecolor;

	 public Human(String name, int age, int height, String eyecolor) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyecolor = eyecolor;
	}

	{ // constructor= making an object ; constr. method have exactly the same name as
						// the class always
          
    	 }

	public void speak() {
		System.out.println("Hello My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My height is " + height);
		System.out.println("Eye color is " + eyecolor);

	}

	public void eat() {
		System.out.println("eating");
	}

	public void walk() {
		System.out.println("walking");
	}

	public void work() {
		System.out.println("working");
	}

	

}