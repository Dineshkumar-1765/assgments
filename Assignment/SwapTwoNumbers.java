package Assignment;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=10,b=30;
		
		//a=a+b-(b=a);-->this way can posible below c
		a^=b;
		b^=a;
		a^=b;
		System.out.println(a);
		System.out.println(b);

	}

}
