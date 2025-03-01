package Assignment;

public class TypeCasting {

	public static void main(String[] args) {
		 byte byteValue = 10;
	        short shortValue = byteValue; // byte to short
	        int intValue = shortValue; // short to int
	        long longValue = intValue; // int to long
	        float floatValue = longValue; // long to float
	        double doubleValue = floatValue; // float to double
	        
	        System.out.println("Widening Conversion:");
	        System.out.println("byte to short: " + shortValue);
	        System.out.println("short to int: " + intValue);
	        System.out.println("int to long: " + longValue);
	        System.out.println("long to float: " + floatValue);
	        System.out.println("float to double: " + doubleValue);

	        // Narrowing Conversion (Explicit Casting)
	        double doubleVal = 99.99;
	        float floatVal = (float) doubleVal; // double to float
	        long longVal = (long) floatVal; // float to long
	        int intVal = (int) longVal; // long to int
	        short shortVal = (short) intVal; // int to short
	        byte byteVal = (byte) shortVal; // short to byte
	        
	        System.out.println("\nNarrowing Conversion:");
	        System.out.println("double to float: " + floatVal);
	        System.out.println("float to long: " + longVal);
	        System.out.println("long to int: " + intVal);
	        System.out.println("int to short: " + shortVal);
	        System.out.println("short to byte: " + byteVal);

	}

}
