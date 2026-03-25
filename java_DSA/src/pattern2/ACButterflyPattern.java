package pattern2;
import java.util.*;
public class ACButterflyPattern {
	
	public static void Butterflypattern(int n) {
		for(int i = 1;i<=n; i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j = 1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j = 1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a n Number : ");
		int n = s.nextInt();
		
		Butterflypattern(n);
	}
}
