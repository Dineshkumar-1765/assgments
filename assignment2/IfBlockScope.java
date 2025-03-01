package assignment2;

public class IfBlockScope {

	public static void main(String[] args) {
		  int outsideVariable = 10; 
	        
	        if (outsideVariable > 0) {
	            int insideVariable = 20; 
	            System.out.println("Inside if block: Outside Variable = " + outsideVariable);
	            System.out.println("Inside if block: Inside Variable = " + insideVariable);
	        }
	        
	        System.out.println("Outside if block: Outside Variable = " + outsideVariable);
	        // System.out.println("Outside if block: Inside Variable = " + insideVariable); // Compiler Error: Cannot find symbol
	    

	}

}
