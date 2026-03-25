package pattern2;
import java.util.*;

// My method

public class ButterflyPattern {
	
	public static void butterflyPattern(int n ) {
		for(int i= 1;i<=n/2;i++) {
			for(int j =1;j<=n;j++) {
				if( j <=i || j>n-i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i = n/2; i>=1;i--) {
			for(int j =1;j<=n;j++) {
				if( j <=i || j>n-i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a n for printing Butterfly Pattern :  ");
		int n = s.nextInt();
		
		if(n % 2 == 0) {
			butterflyPattern(n);
		}else {
			System.out.println("Please Enter a Even Number");
		}
	}
   
}