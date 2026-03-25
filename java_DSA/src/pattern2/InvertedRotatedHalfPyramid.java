package pattern2;
import java.util.*;
public class InvertedRotatedHalfPyramid {

	public static void InvertedRotatedPyramid(int n) {
		
		for(int i = 1;i<=n;i++) {
			for(int j =1 ;j<=n-i;j++) {
				System.out.print("  ");
			}
			
			for(int j =1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the n for n*n matrix Inverted Rotated Half Pyramid : ");
		int n = s.nextInt();
		
		InvertedRotatedPyramid(n);
		
	}

}
