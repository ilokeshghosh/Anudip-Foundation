package OOPs;

//no-args constructor
//parameterized constructor
//toString method
//setter and getter method
//maintain encapsulation - all the variable will be private 

class College{
	private int collegeId;
	private String collegeName;
	
	
	public College() {
		super();
		
	}
	public College(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}
	
	//setter method for college id
	public void setCollegeId(int collegeId) {
		this.collegeId=collegeId;
	}
	
	//getter method for college Id
	public int getCollegeId() {
		return collegeId;
	}
	
	//setter method of college name
	public void setCollegeName(String collegeName) {
		this.collegeName=collegeName;
	}
	
	//getter method of college name
	public String getCollegeName() {
		return collegeName;
	}
	
	//to string method to print data
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
	}
	
	
	
	
	
	
}
public class JavaBeanDemo {

	public static void main(String[] args) {
		College c1= new College();
		c1.setCollegeId(102);
		System.out.println(c1.getCollegeId());
		c1.setCollegeName("MAKAUT");
		System.out.println(c1.getCollegeName());
		System.out.println(c1);
	
		
		

	}

}
