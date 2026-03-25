package bitManipulation;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 5,b= 6;
		// Bitwise AND (&)
		System.out.println("Bitwise AND of 5 & 6 = "+(a & b));
		
		// Bitwise OR (|)
		System.out.println("Bitwise OR of 5 | 6 = "+(a | b));
		
		// Bitwise XOR(^)
		System.out.println("Bitwise OR of 5 ^ 6 = "+(a ^ b));
		
		// Bitwise 1's Complement 
		System.out.println("Bitwise OR of ~5 = "+(~a));
		
		// Bitwise left Shift (<<)
		System.out.println("Bitwise OR of 5 << 6 = "+(a << b));
		
		// Bitwise Signed Right Shift(>>)
		System.out.println("Bitwise OR of 5 >> 6 = "+(-a >> b));
		
		// Bitwise Signed Right Shift(>>>)
		System.out.println("Bitwise OR of 5 >>> 6 = "+(-a >>> b));
	}

}
