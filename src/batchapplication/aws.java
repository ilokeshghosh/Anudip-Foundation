package batchapplication;

public class aws {
	private int stdId;
	private String stdName;
	private long phone;
	private String email;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public aws(int stdId, String stdName, long phone, String email) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.phone = phone;
		this.email = email;
	}
	public aws() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
