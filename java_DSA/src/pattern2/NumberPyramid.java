package pattern2;
import java.util.*;
public class NumberPyramid {

	public static void numberPyramid(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j =1 ;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number n for the Number Pyramid : ");
		int n = s.nextInt();
		
		numberPyramid(n);
	}

}
