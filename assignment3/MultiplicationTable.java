package assignment3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		multiplicationTable();

	}
	public static void multiplicationTable() {
		Scanner scanner =new Scanner (System.in);
		
		System.out.println("Enter the  starting range :");
		
		int startRange=scanner.nextInt();
		System.out.println("Enter the  ending range :");
		
		int endingtRange=scanner.nextInt();
		System.out.println("Enter Which table your print :");
		
		int table=scanner.nextInt();
		
		scanner.close();
		for(int i=startRange;i<=endingtRange;i++) {
			System.out.println(i+" X "+table+" = "+ (i*table));
		}
		
	}

}
