package abstractionDemo;

//Single inheritance
class Aa{
	public void Display() {
		System.out.println("This is Display method");
	}
}

abstract class Bb extends Aa{
		abstract void demo();
		
		public void Display() {
			System.out.println("This Display method is inherited from Class A ");
		}
}


//Multiple inheritance 
interface Cc {
	void fun();
}


class Dd extends Bb implements Cc{

	@Override
	public void fun() {
		System.out.println("This fun method is defined in interface C but overrided in class D ");
		
	}

	@Override
	void demo() {
		System.out.println("This demo method is defined in Abstract class B  but overrided in class D ");
		
	}
	
}
public class HybridInheritance {

	public static void main(String[] args) {
		Dd d = new Dd();
		d.Display();
		d.fun();
		d.demo();
		

	}

}
