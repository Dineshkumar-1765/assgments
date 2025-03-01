package Assignment;

public class MultipleClasses {

	public static void main(String[] args) {
		
		MultipleClasses1 classObj_1=new MultipleClasses1();
		
		classObj_1.main();
		
		MultipleClasses2 classObj_2=new MultipleClasses2();
		classObj_2.main();
	}

}
class MultipleClasses1{

	void main() {
		System.out.println("first sub class 1");
	}

}
class MultipleClasses2{

	 void main() {
		 System.out.println("second sub class 2");
	}

}
