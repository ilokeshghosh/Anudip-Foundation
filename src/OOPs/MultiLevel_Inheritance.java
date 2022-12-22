package OOPs;
//In multilevel inheritance there is a grandparent class, parent class and child class
//A child class can access all the information form the parent class as well as the grandparent class
class Animal{
	public void display() {
		System.out.println("Animal KingDom");
	}
	
}


class Mammal extends Animal{
	public void birth() {
		System.out.println("Mammals give birth to offsprings");
	}
}

class Dog extends Mammal{
	public void puppy() {
		System.out.println("Dog's offsprings are called puppy");
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		Dog tommy = new Dog();
		tommy.display();
		tommy.birth();
		tommy.puppy();
		
	}

}
