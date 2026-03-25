package bitManipulation;
import java.util.*;
public class OpertaionOnBits {
	static Scanner s = new Scanner(System.in);
	public static int Getith(int n) {
		
		System.out.println("Enter the i for getting ith Bit : ");
		int i = s.nextInt();
		if((n & (1<<i)) != 0) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		System.out.println("ith bit  = "+Getith(n));
	}

}
