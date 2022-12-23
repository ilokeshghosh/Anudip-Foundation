package OOPs;


class Company{
	int compId;
	String companyName;
	Address address; //Entity reference 
	
	public Company(int compId, String companyName, Address address) {
		this.compId= compId;
		this.companyName= companyName;
		this.address = address;
		
	}

	
	//getter method
	public int getCompId() {
		return compId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public Address getAddress() {
		return address;
	}
	
	
	
}
public class AggregationDemo {

	public static void main(String[] args) {
		Address add1 = new Address(101,"Kolkata","West Bengal","India");
		Address add2 = new Address(201, "Noida", "Uttar Pradesh", "India");
		
		Company c1= new Company(401,"Anudip Foundation",add1);
		Company c2 = new Company(403,"TCS ",add2);
		
		
		System.out.println("First Company : "+c1.getCompanyName());
		System.out.println("Address :"+c1.getAddress().getCity());
		
		System.out.println();
		System.out.println("Second Company : "+c2.getCompanyName());
		System.out.println("Address :"+ c2.getAddress().getCity());
				

	}

}
