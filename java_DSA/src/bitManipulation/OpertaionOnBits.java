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
	
	public static int setithBit(int n) {
		System.out.println("Enter the i for Setting ith bit to 1 : ");
		int i = s.nextInt();
		n = (n | (1 << i));
		return n;
	}
	
	public static int ClearithBit(int n) {     // Clear ith Bit 
 		System.out.println("Enter the i for Setting ith bit to 0: ");
		int i = s.nextInt();
		n = (n & ~(1 << i));
		return n;
	}
	
	public static int UpdateithBit(int n) {
		System.out.println("Enter the i for Bit update position : ");
		int i = s.nextInt();
		System.out.println("Enter the newbit for Updation : ");
		int newbit  = s.nextInt();
		return (n & ~(1<<i))| (newbit << i);
	}
	
	public static int ClearlastiBits(int n) {
		System.out.println("Enter i for clearing last i digit : ");
		int i = s.nextInt();
		n = (n & (-1 << i));
		return n;
	}
	
	public static int ClearBitsformItoJ(int n) {
		System.out.println("Enter the i : ");
		int i = s.nextInt();
		System.out.println("Enter j : ");
		int j = s.nextInt();
//		n = n & ((-1 << j+1) | ~(-1 << i));
		n = n & ((-1 << j+1) | (1 << i)-1);
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
//		System.out.println("ith bit  = "+Getith(n));
//		System.out.println("after set ith bit : "+setithBit(n));
//		System.out.println("after clear ith bit: "+ClearithBit(n));		// Clear ith bit
//		System.out.println("After Update ith bit :"+UpdateithBit(n));
//		System.out.println("After Clear the Last ith Bit : "+ClearlastiBits(n));
		System.out.println("After the Clear the bit from i to j : "+ClearBitsformItoJ(n));
	}

}
