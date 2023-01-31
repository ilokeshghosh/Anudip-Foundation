package FunctionalInterface;

@FunctionalInterface
interface sayables{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class FunInterEX implements sayables{

	public static void main(String[] args) {
	
		FunInterEX f1 = new FunInterEX();
		f1.say("Hello Java 8");
	}
	
	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	

	

}
