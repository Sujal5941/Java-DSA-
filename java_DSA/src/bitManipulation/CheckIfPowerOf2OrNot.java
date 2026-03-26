package bitManipulation;
import java.util.*;
public class CheckIfPowerOf2OrNot {

	public static int PowerOf2(int n) {
		return n & (n-1);
	}
	
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		if(PowerOf2(n) == 0) {
			System.out.println(n+" is Power of 2");
		}else {
			System.out.println(n+" is Not Power Of 2");
		}
	}

}
