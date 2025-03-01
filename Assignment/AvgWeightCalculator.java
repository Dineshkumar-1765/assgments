package Assignment;
import java.util.Scanner;;
public class AvgWeightCalculator {

	public static void main(String[] args) {
		
		System.out.println("how many people weight you can calculate?\n enter the numberof presons :");
		
		Scanner sc = new Scanner (System.in);
		
		int numberOf_People=sc.nextInt();
		
		double[] weights=new double [numberOf_People];
		double totWeight=0;
		
		for(int i=0;i<numberOf_People;i++) {
			System.out.println("Enter the "+(i+1)+" person weight (in kg):");
			
			weights[i]=sc.nextDouble();
			totWeight+=weights[i];
			
		}
		
		double avgWeight=totWeight/numberOf_People;
		System.out.printf("The average weight of %d people is: %.2f kg\n", numberOf_People, avgWeight);
	    
	}

}
