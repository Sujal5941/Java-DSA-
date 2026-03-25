package pattern1;
import java.util.*;
public class InvertedStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a n for inverted Star Pattern : ");
		int n = s.nextInt();
		
		for (int i = 1;i<=n;i++) {
			for(int j = n-i+1; j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
