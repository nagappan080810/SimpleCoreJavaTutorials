/***
** Employee Bean 
**    -- holds first name and last name and make sure that is not duplicated.
****/
public class EmployeeBean {
	private String firstName;
	private String lastName;
	private String completeStr;
	
	public EmployeeBean(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.completeStr = firstName + " " + lastName;
	}

	public String getFirstName() {
	   return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}
	
	public String getCompleteStr() {
		return this.completeStr;
	}
	
	public int hashCode() {
		return completeStr.hashCode();
	}
	
	public boolean equals(EmployeeBean employee) {
		if (this.completeStr.equals(employee.getCompleteStr())) {
			return true;
		}
		return false;
	}
	
	public String toString(){
		String resultStr = "first Name -"+this.firstName+"---";
		resultStr = resultStr + "last Name -" + this.lastName+"---";
		resultStr = resultStr + super.toString();
		return resultStr;
	}
}