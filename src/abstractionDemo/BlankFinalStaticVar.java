package abstractionDemo;

public class BlankFinalStaticVar {
	
	static final int data;
	static {
		data =4;
	}
	
	public int cube(final int n) {
	
		int a =n;
		return a;
	}
	public static void main(String[] args) {
		System.out.println(data);
	}

}
