package entity;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	private Long empId;
	private String firstName;
	private String lastName;
	private String dob;
	private String emailId;
	private Department department;
	
	public Employee() {
	}
	
	public Employee(String firstName, String lastName, String dob, String emailId, int deptId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.emailId = emailId;
		this.deptId = deptId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", emailId=" + emailId
				+ ", deptId=" + deptId + "]";
	}
	
	

}
