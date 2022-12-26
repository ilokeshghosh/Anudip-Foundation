package abstractionDemo;
interface A{
	public void display();
	
}

interface B{
	public void display();
}

class C implements A,B{
	public void display() {
		System.out.println("Hello");
	}
}



public class MultipleInheritance {

	public static void main(String[] args) {
		

	}

}
