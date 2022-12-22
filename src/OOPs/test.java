package OOPs;

public class test {

	public static void main(String[] args) {
		StudentNew s1 = new StudentNew();
		s1.setId(101);
		System.out.println(s1.getId());
		s1.setFirstName("Lokesh");
		System.out.println(s1.getFirstName());
		s1.setLastName("Ghosh");
		System.out.println(s1.getLastName());
		s1.setAddress("Kolkata");
		System.out.println(s1.getAddress());

	}

}
