package pattern2;
import java.util.*;
public class InvertedHalfPyramid_Number {

	public static void InvertedNumberHalfpyramid(int n) {
		for(int i =1 ;i<=n;i++) {
			for(int j = 1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the N for Inverted Half Pyramid Pattern : ");
		int n = s.nextInt();
		
		InvertedNumberHalfpyramid(n);
	}

}
