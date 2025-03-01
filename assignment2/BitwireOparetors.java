package assignment2;

import java.util.Scanner;

public class BitwireOparetors {

	public static void main(String[] args) {
		System.out.println("Bitwires Oparetors");
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter  number1: ");
	        int num1 = scanner.nextInt();
	        System.out.println("Enter number2: "); 
	        int num2 = scanner.nextInt();
	        scanner.close();
	        System.out.println("Bitwise AND: " + (num1 & num2));
	        System.out.println("Bitwise OR: " + (num1 | num2));
	        System.out.println("Bitwise XOR: " + (num1 ^ num2));
	        System.out.println("Left shift num1 by 2: " + (num1 << 2));
	        System.out.println("Right shift num1 by 2: " + (num1 >> 2));
	}

}
