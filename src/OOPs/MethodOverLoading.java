package OOPs;

class Addition{
	public void add(int a) {
		System.out.println("Addiition of one parameter :"+(a+10));
	}
	public void add(int a, int b, int c) {
		System.out.println("Addition of three parameters :"+(a+b+c));
	}
	public void add(double a, double b) {
		System.out.println("Addition of parameter(double, double: "+(a+b));
		
	}
	public void add(int a, double b) {
		System.out.println("Addition of parameter(int,double) :"+(a+b));
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		Addition num = new Addition();
		num.add(10);
		num.add(20,30,40);
		num.add(23.2,1.8);
		num.add(5,20.8);

	}

}
