package OOPs;

//parent/super/base class
class user{
	int id;
	String name,address;
	
	public void setData(int id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address= address;
	}
	public void display() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}

//child/sub/derived class
class Teacher extends user{
	double salary;
	String subject;
	public void setData(int id, String name, String address, double salary, String subject) {
		super.setData(id, name, address);
		this.salary = salary;
		this.subject= subject;
	}
	
	public void display() {
		super.display();
		System.out.println("Salary :"+salary);
		System.out.println("Subject : "+ subject);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setData(101, "Lokesh", "Kolkata", 20000, "Java");
		t1.display();

	}

}
