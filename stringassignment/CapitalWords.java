package stringassignment;

import java.util.Scanner;

public class CapitalWords {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String sentence = sc.nextLine();
        String capitalWords = capitalSentence(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Capitalized Sentence: " + capitalWords);
        sc.close();
	}
	public static String capitalSentence(String sentence) {
        if (sentence == null) {
            return sentence; 
        }
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
               result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }
        return result.toString().trim();
    }
}
