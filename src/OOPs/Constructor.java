package OOPs;

class Students{
	int id;
	String name,address;
	long phone;
	static String institute="Anudip Foundation";
	public Students(int id, String name, String address, long phone) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	
	public void display() {
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :"+ address);
		System.out.println("Mobile No :"+ phone);
		System.out.println("Institute :"+institute);
	}
	
	public static void changeInstitute() {
		institute=" Anudip Foundation for Social Welfare";
	}
}
public class Constructor {

	public static void main(String[] args) {
		Students s1= new Students(1,"Lokesh Ghosh","Kolkata",1234567890L);
		s1.display();
		System.out.println("\n After Changing Intitute Name \n");
		s1.changeInstitute();
		s1.display();

	}

}
