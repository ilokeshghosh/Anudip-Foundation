package abstractionDemo;

interface Printable{ //1st interface
		int x=100;
		 
		//we cannot add the body of the method so we need to implement it 
		void display();
		void fun();
}




//interface --> interface (extends)
//class --> class(extends)
//class-->interface(implements)




interface Drawable extends Printable{ //2nd interface inheriting 1st interface
	void draw();
}





//third interface without using extends it inherits both Printable and Drawable
interface Sayable{
	void say();
	int  x=10;
	
}





class Print implements Drawable{

	@Override
	public void display() {
		System.out.println("This is display method ");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun method ");
		
	}

	@Override
	public void draw() {
		System.out.println("This is draw method ");
		
	}
	 
}




//Using interface we can perform multiple inheritance (though not supported in JAVA)
class Message implements Drawable,Sayable{
//we can solve the diamond problem using interface
//a class can inherit any number of interfaces
	@Override
	public void display() {
		System.out.println("This is display method ");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun method ");
		
	}

	@Override
	public void say() {
		System.out.println("This is say method ");
		
	}

	@Override
	public void draw() {
		System.out.println("This is draw method ");
		
	}
	
}



public class InterfaceDemo {

	public static void main(String[] args) {
		//We cannot instantiate interface , but we can create reference variable
		Print  print = new Print();
		print.display();
		print.draw();
		print.fun();
		System.out.println("The value of x is :   "+print.x);
		
		System.out.println();
		
		Message message = new Message();
		message.display();
		message.fun();
		message.say();
		message.draw();
		System.out.println("The value of x  is : "+Sayable.x);
		
		

	}

}
