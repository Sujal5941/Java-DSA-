package pattern1;
import java.util.*;

public class PrintHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the n for the halp Pyramid : ");
		int n = s.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
