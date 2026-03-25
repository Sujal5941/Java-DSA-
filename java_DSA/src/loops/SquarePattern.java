package loops;
import java.util.*;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N for N*N Square Pattern : ");
		int n = s.nextInt();
		
		for(int i = 0; i<n;i++) {
			for(int j =0 ;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
