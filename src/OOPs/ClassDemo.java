package OOPs;

class Student{
	int id;
	String name,address;
	long phone;
	public void setData(int id, String name, String address, long phone) {
		this.id=id;
		this.name= name;
		this.address=address;
		this.phone=phone;
	}
	public void getData() {
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile No. :"+phone);
		
		
	}
	
}
public class ClassDemo {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setData(1, "Lokesh Ghosh", "Kolkata", 123467890L);
		s1.getData();

	}

}
