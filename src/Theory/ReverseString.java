package Theory;

public class ReverseString {

	public static void main(String[] args) {
		String temp="";
		char ch;
		String str = "India";
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			temp=ch+temp;
			
		}
		System.out.println(temp);

	}

}
