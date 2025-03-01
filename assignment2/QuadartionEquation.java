package assignment2;

import java.util.Scanner;

public class QuadartionEquation {

	public static void main(String[] args) {
		  System.out.println("Enter coefficients a ");
		  
		  Scanner sc=new Scanner(System.in);
		  
		  double a=sc.nextDouble();
		  System.out.println("Enter coefficients b"); 
		  double b=sc.nextDouble();
		  System.out.println("Enter coefficients c");
		  double c=sc.nextDouble();
		   sc.close();
		  double decriminant=b*b-(4*a*c);
		  
		  if(decriminant>0) {
			  double root1=(-b+Math.sqrt(decriminant))/(2*a);
			  double root2=(-b-Math.sqrt(decriminant))/(2*a);
			  
			  System.out.printf("Roots are: %.2f and %.2f\n", root1, root2);
		  }
		  else if(decriminant==0) {
			  double root = -b / (2 * a);
	            System.out.printf("Root is: %.2f\n", root);
		  }
		  else {
			  System.out.println("no real root exit..");
		  }
		  
	}

}
