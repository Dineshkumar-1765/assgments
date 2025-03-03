package assignment3.unconditional;

import java.util.Scanner;

public class SecondOccurrence {

	public static void main(String[] args) {
		 Occurrence();

	}
	public static void Occurrence () {
		Scanner scanner = new Scanner(System.in);
        
        int[] arr = {2, 4, 6, 8, 4, 10, 4, 12};
        
        System.out.print("Enter number to find second occurrence: ");
        int target = scanner.nextInt();
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == 2) {
                    System.out.println("Second occurrence found at index: " + i);
                    scanner.close();
                    return;
                }
            }
        }
        
        System.out.println("Second occurrence not found.");
        scanner.close();
	}

}
