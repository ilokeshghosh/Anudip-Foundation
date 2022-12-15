package Lab;

public class factorial {

	public static void main(String[] args) {
		int num=10;
		
		int mul=1;
		
		for(int i=1;i<=10;i++) {
			if(num==0) {
				mul=0;
				break;
			}
			if(num==1) {
				mul*=1;
				break;
			}
			 
			mul*=i;
			
		}
		System.out.println(mul);
	}

}
