package assignment2;

import java.util.Scanner;

public class ConvertCelsiusToFahranheit {

	public static void main(String[] args) {
		
		System.out.println(" Enter the celsius : ");
		
		Scanner sc =new Scanner(System.in);
		
		double celsius=sc.nextDouble();
		
		sc.close();
		
		double fahranheit=(celsius*9/5)+32;
		
		System.out.printf("%.2f Celsius is %.2f Fahrenheit\n",celsius,fahranheit);
	}

}
