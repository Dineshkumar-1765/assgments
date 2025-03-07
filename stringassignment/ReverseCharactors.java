package stringassignment;

import java.util.Scanner;

public class ReverseCharactors {

	public static void main(String[] args) {
		
		reverseCharactors();

	}
	public static void reverseCharactors() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Words : ");
		
		String str=scanner.next();
		
		int end=0,start=str.length();
		String res="";
		
		while(start-->end) {
			res+=str.charAt(start);
		}
		
		System.out.println("reversed word is :"+res);
		
		scanner.close();
		
	}

}
