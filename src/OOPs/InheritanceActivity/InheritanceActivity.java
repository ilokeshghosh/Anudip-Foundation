package OOPs.InheritanceActivity;


class Employee{ //parent class
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary, specialAllowance = 250.80,hra = 1000.50;
	
	//overloading constructor
	public Employee(int Id, String Name, String address, long phone){
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress= address;
		this.employeePhone = phone;
	}
	
	//defining default constructor
	public Employee() {
		
	}
	
	
	//method named calculated salary to calculate salary using basic salary with special allowance and hra
	public double calculatedSalary() {
		double salary = basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		return salary;
	}
	
	
	//method named calculateTransportAllowance to calculate the transporting allowance using basic salary
	public double calculateTransportAllowance() {
		return (10*basicSalary)/100;
	}
	
}



//child-1 manager that extends parent employee
class Manager extends Employee{
	
	//overloading constructor
	public Manager(long Id, String Name, String address, long phone,double salary) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress= address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}

	
	
	 
	@Override
	public String toString() {
		return "Manager [employeeId=" + employeeId + ", employeePhone=" + employeePhone + ", employeeName="
				+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", hra=" + hra + "]";
	}




	//method named calculateTransportAllowance to calculate the transporting allowance using basic salary
	public double calculateTransportAllowance() {
		return (15*basicSalary)/100;
	}
	
}

//child-2 Trainee that extends parent employee
class Trainee extends Employee{
	public Trainee(long Id, String Name, String address, long phone,double salary) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress= address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}

	@Override
	public String toString() {
		return "Trainee [employeeId=" + employeeId + ", employeePhone=" + employeePhone + ", employeeName="
				+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", hra=" + hra + "]";
	}
	
	
}


//Driver Class 
public class InheritanceActivity {

	public static void main(String[] args) {
		
		//Manager 
		Manager emp1 = new Manager(1234,"Peter","Chennai",237844,65000);
		System.out.println("Details of Manager are :\n"+emp1);
		System.out.println("\nSalary of "+emp1.employeeName+" is :"+emp1.calculatedSalary());
		System.out.println("\nTransport Allowance of "+emp1.employeeName+" is :"+emp1.calculateTransportAllowance());
		
		System.out.println("\n\n");
	
		
		//Trainee
		Trainee emp2 = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("Details of Trainee are :\n"+emp2);
		System.out.println("\nSalary of "+emp2.employeeName+" is :"+emp2.calculatedSalary());
		System.out.println("\nTransport Allowance of "+emp1.employeeName+" is :"+emp2.calculateTransportAllowance());

	}

}
