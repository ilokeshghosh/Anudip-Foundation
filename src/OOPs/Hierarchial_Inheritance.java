package OOPs;

//Super Class
class Animal1{
	public void sound() {
		System.out.println("Different Animals have different sounds");
	}
}


//Sub class 1
class Snake extends Animal1{
	public void sound() {
		System.out.println("Snake sounds hissing");
	}
}


//Sub class 2
class Cat extends Animal1{
	public void sound() {
		System.out.println("Cat sounds mew mew");
	}
}


//Sub class 3
class Cow extends Animal1{
	public void sound() {
		System.out.println("Cow counds moo moo");
	}
}


//driver class
public class Hierarchial_Inheritance {

	public static void main(String[] args) {
		Animal1 unknown = new Animal1();
		unknown.sound();
		Snake cobra = new Snake();
		cobra.sound();
		Cat oscar = new Cat();
		oscar.sound();
		Cow jersey = new Cow();
		jersey.sound();
		
		

	}

}
