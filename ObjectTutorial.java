/***
** Object Tutorial 
**    -- Created a bean for employee to override the equals and hashcode of implicit Object class
**    -- equals and hashcode has been overriden in order to find duplicated employee object reference.
****/
public class ObjectTutorial {
	public static void main(String args[]) {
		EmployeeBean employee1 = new EmployeeBean("Rajesh","Kannan");
		System.out.println("Employee-1 String1 -" + employee1.toString());
		EmployeeBean employee2 = new EmployeeBean("Kannan","Rajesh");
		System.out.println("Employee-2 String -" + employee2.toString());
		EmployeeBean employee3 = new EmployeeBean("Rajesh","Kannan");
		System.out.println("Employee-3 String" + employee3.toString());
		System.out.println("hash code of employee1 -"+employee1.hashCode());
		System.out.println("hash code of employee2 -"+employee2.hashCode());
		System.out.println("hash code of employee3 -"+employee3.hashCode());
		System.out.println("Employee1 is equal to Employee2?"+employee1.equals(employee2));
		System.out.println("Employee1 is equal to Employee3?"+employee1.equals(employee3));
		
	}
}