package assignment3;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter  numb1ers: ");
     int num1 = scanner.nextInt();

	 System.out.println("Enter  numb1ers: ");
     int num2 = scanner.nextInt();

	 System.out.println("Enter  numb1ers: ");
     int num3 = scanner.nextInt();
     
     if(num1>num2&&num1>num3) System.out.println("GreatestNumber is: "+num1);
     else if(num1<num2&&num2>num3)System.out.println("GreatestNumber is: "+num2);
     else System.out.println("GreatestNumber is: "+num3);
     
     scanner.close();

	}

}
