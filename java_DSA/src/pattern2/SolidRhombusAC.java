package pattern2;
import java.util.*;
public class SolidRhombusAC {

	public static void SolidRhomb(int n ) {
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a n for printing the Solid Rhombus : ");
		int n = s.nextInt();
		
		SolidRhomb(n);
	}

}
