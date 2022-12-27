package abstractionDemo;

//Another way of performing multiple inheritance
abstract class B{ //Declaring an abstract class
	
	abstract void display();//abstract method
	
	public void demo() {//concrete method
		System.out.println("This is demo method in side B abstract class");
	}
}





interface C{ //declaring an interface
	void add(int a, int b);
}




class D extends B implements C{

	@Override
	public void add(int a, int b) {
		System.out.println("This is add method inherited from C interface");
		System.out.println("summation : "+(a+b));
	}

	
	
	@Override
	void display() {
		System.out.println("This is demo method inherited from  B abstract class");
		
	}
	
}



public class MultipleInheritance {

	public static void main(String[] args) {
		
		D d = new D();
		d.add(8, 2);
		d.display();
		d.demo();
		

	}

}
