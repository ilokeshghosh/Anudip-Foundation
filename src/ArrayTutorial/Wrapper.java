package ArrayTutorial;

public class Wrapper {

	public static void main(String[] args) {
		//autoboxing - conversion of primitive data types into its corresponding wrapper class
		
		int a=20;
		Integer b= Integer.valueOf(a); //Converting int into Integer manually
		System.out.println(b);
		
		Integer c =a; //automatic
		System.out.println(c);
		
		
		
		//Unboxing -> conversion of objects into primitive data types
		
		Integer x= 7;
		int y = x.intValue(); //Manual 
		int z=x ; //Automatic
		System.out.println();
		
		int i = 20;
		float f = 20.2f;
		System.out.println(((Object)i).getClass().getName());
		System.out.println(((Object)f).getClass().getName());
		
		
		

	}

}
