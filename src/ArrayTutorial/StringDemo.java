package ArrayTutorial;

public class StringDemo {

	public static void main(String[] args) {
		/*
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
			
			//compare to method
			String s1 = new String("Amrita");
			String s2 = new String("Amrita");
			String s3 = new String("Lokesh");
			String s4 = new String("Pritam");
			String s5 = new String("Priya");
			System.out.println(s1.compareTo(s2));
			System.out.println(s1.compareTo(s3));
			System.out.println(s4.compareTo(s3));
			System.out.println(s4.compareTo(s5));
			
			
			
			String a = "Hello Java";
			
			//contains to method
			System.out.println(a.contains("e"));
			
//			index of method
			System.out.println(a.indexOf("o"));
			
			//ends with method
			System.out.println(a.endsWith("a"));
			
			*/
		
		
		//String Builder
		/*
			StringBuilder builder = new StringBuilder("Hello World");
			builder.append(" i am learning java"); //append is used to join strings
			System.out.println(builder);
			builder.insert(11, ",");
			System.out.println(builder);
			builder.replace(13, 14, "I");
			System.out.println(builder);
			builder.replace(13, 17, "I love");
			System.out.println(builder);
			builder.setCharAt(27, 'J');
			System.out.println(builder);
			builder.reverse();
			System.out.println(builder);
			
			StringBuilder hello = new StringBuilder("Hello");
			hello.delete(1, 3);
			System.out.println(hello);
			
			*/
		
		
		//String Buffer
		StringBuffer buffer = new StringBuffer("hello java");
		System.out.println(buffer.capacity());
		buffer.append(" world");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		
		StringBuffer test = new StringBuffer("");
		System.out.println(test.capacity());
		
		System.out.println(buffer.indexOf("java")); //index of the word
		
		//sub string can be done in two ways
		System.out.println(buffer.substring(6));
		System.out.println(buffer.substring(6,10));
		
		buffer.delete(10,16);
		System.out.println(buffer);
		
		
			
			
			
	}

}
