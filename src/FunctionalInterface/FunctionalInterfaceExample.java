package FunctionalInterface;

@FunctionalInterface
interface sayable{
	void say(String msg);
}

public class FunctionalInterfaceExample implements sayable {

	public static void main(String[] args) {
		FunctionalInterfaceExample f1 = new FunctionalInterfaceExample();
		f1.say("Hey There");
	}

	@Override
	public void say(String msg) {
		System.out.println(msg);
		
	}

}
