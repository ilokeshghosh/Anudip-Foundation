package OOPs;

@FunctionalInterface
interface stud{
	void studinfo();
}

//class JC implements stud{
//
//	@Override
//	public void studinfo() {
//		System.out.println("HIII");
//		
//	}
//	
//}


public class test1 {

	public static void main(String[] args) {
		
		
		
//		stud s1 = new JC();
//		s1.studinfo();
		
		
		
//		stud s1 = new stud() {
//			public void studinfo() {
//				System.out.println("HIiii");
//			}
//		};
		
		
		stud s1 =()->System.out.println("hiii");
		s1.studinfo();

	}

}
