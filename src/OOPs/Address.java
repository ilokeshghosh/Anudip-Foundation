package OOPs;

public class Address {
	int pincode;
	String city,state,country;
	
	public Address(int pincode, String city, String state, String country) {
//		super();
		this.pincode= pincode;
		this.city = city;
		this.state =  state;
		this.country = country;
		
	}
	
	public Address() {
//		super();
	}
	
	//getter and setter methods
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static void main(String[] args) {
		
	}

}
