package assignment3.unconditional;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		sumOfEvenNumbers();

	}
	
	public static void sumOfEvenNumbers() {
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int sum = 0;

	        for (int num : arr) {
	            if (num % 2 != 0) {
	                continue; // Skip odd numbers
	            }
	            sum += num;
	        }
	        System.out.println("sumOfEvenNumbers :"+sum);

	}
}
