package assignment3;

import java.util.Scanner;

public class GradeCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter student score: ");
	        int score = scanner.nextInt();
	        scanner.close();
	        char grade;

	        if (score >= 90) grade = 'A';
	        else if (score >= 80) grade = 'B';
	        else if (score >= 70) grade = 'C';
	        else if (score >= 60) grade = 'D';
	        else grade = 'F';

	        System.out.println("The student's grade is: " + grade);


	}

}
