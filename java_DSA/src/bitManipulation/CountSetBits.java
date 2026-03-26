package bitManipulation;
import java.util.*;
public class CountSetBits {

	public static int CountSetBit(int n) {
		int count = 0;
		while(n>0) {
			if((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number for Counting set bit : ");
		int n = s.nextInt();
		
		System.out.println("Count of Set Bits : "+CountSetBit(n));
	}

}
