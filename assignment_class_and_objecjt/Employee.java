package assignment_class_and_objecjt;

public class Employee {

	private int employeeId;
	
	private String employeeName;
	
	private String eMail;
	
	private String department;
	
	private double salary;
	
public 	Employee(int employeeId,String employeeName,String eMail,String department,double salary){
		
		this.employeeId=employeeId;
		
		this.employeeName=employeeName;
		
		this.eMail=eMail;
		
		this.department=department;
		
		this.salary=salary;
		
	}
	
	//get and set
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		if(eMail.contains("@")&&eMail !=null)
		this.eMail = eMail;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void displayDetails()
	{
		System.out.println(" employeeId :"+employeeId+"\n employeeName :"+employeeName+" \n eMail :"+eMail+"\n department :"+department+"\n salary :"+salary);
	}
	
	
}
