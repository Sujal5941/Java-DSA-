package pattern2;
import java.util.*;
public class daimondPattern {

	public static void Daimond(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j =1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<= 2*i -1;j++) {
				System.out.print("* ");
			}
			for(int j =1 ;j<=n-i;j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i = n;i>=1;i--) {
			for(int j =1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<= 2*i -1;j++) {
				System.out.print("* ");
			}
			for(int j =1 ;j<=n-i;j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a N for printing the Daimond Pattern : ");
		int n = s.nextInt();
		
		Daimond(n);
	}

}
