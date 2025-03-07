package stringassignment;

import java.util.Scanner;

public class ReverseTheWords {

	public static void main(String[] args) {
		
		reverseTheWords();
		
	}
	public static void 	reverseTheWords() {
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Enter the Words :");
		
		String s=scanner.nextLine();
		
		String []str=s.split(" ");
		
		int start=str.length,end=0;
		
		while(start-->end) {
			
			System.out.print(str[start]+" ");
			
		}
		
		scanner.close();
		
		
	}
}
