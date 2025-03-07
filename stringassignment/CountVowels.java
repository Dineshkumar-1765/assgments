package stringassignment;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		
		countVowel();
	}
	
	public static void countVowel() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Words : ");
		
		String str=scanner.next().toLowerCase();
		int count=0;
		int start=0,end=str.length();
		while(start<end) {
			
			char c=str.charAt(start);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
			start++;
		}
		
		System.out.println("Totel Vowels in the  Words : "+count);
		scanner.close();
		
	}

}
