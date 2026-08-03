package polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal animal;
		animal = new Animal();
		animal.sound();
	
		animal = new Dog();
		animal.sound();
		
		animal =new Cat();
		animal.sound();
		
		
		animal =new Cow();
		animal.sound();
		
		

	}

}
