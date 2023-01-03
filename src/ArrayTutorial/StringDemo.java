package ArrayTutorial;

public class StringDemo {

	public static void main(String[] args) {
		
			char[] ch= {'l','o','k','e','s','h'};
			System.out.println(ch);
			
			String s= new String(ch);
			System.out.println(s);
			
			//concept of String literal
			//we mainly use it to save memory so that new memories are not created
			String name ="abcd";
			String name1="abcd";
			
			System.out.println(name.replace('b', 'x'));
			
			System.out.println(name==name1);

			String str = "Welcome";
			
			System.out.println(name==str);
			
			name = name.concat(str);
			System.out.println(name);
			System.out.println(name.length());
			
			
			
			for(int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i));
			}
		
	}

}
