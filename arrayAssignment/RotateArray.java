package arrayAssignment;

import java.util.Scanner;
public class RotateArray {

	public static void main(String[] args) {
		
		rotateArray();
	}
	public static void rotateArray() {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter rotation count: ");
	        int k = scanner.nextInt();
	        
	        rotateRight(arr, k);

	        System.out.println("Rotated array:");
	        for (int num : arr) {
				System.out.print(num + " ");
	        }
	        scanner.close();
	}

	 public static void rotateRight(int[] arr, int k) {
	        int n = arr.length;
	      
	        for(int i=0;i<k;i++) {
	        	
	        	int temp=arr[0];
	        	
	        	for (int j=0;j<n-1;j++) {
	        		arr[j]=arr[j+1];
	        		
	        	}
	        	arr[n-1]=temp;
	        	
	        	
	        }
	       
	    }

}
