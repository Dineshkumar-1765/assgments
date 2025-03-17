package constructor;

import assignment_class_and_objecjt.Employee;

public class EmpolyeeTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee[] empArray = new Employee[3];

	        // constructor
	        empArray[0] = new Employee(101, "ram", "ram123@example.com", "HR", 35000);
	        empArray[1] = new Employee(102, "raja", "raja@example.com", "Finance", 42000);
	        empArray[2] = new Employee(103, "dk", "dk@example.com", "IT", 39000);

	        // Display
	        System.out.println("---- Employee Details ----");
	        for (Employee emp : empArray) {
	            emp.displayDetails();
	            System.out.println("------------------------------");
	        }

	}

}
