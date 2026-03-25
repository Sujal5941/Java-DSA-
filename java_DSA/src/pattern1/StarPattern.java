package pattern1;

/*
  Print the following star Pattern
	 *
	 **
	 ***
	 ****
 */

import java.util.*;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the n for the Star Pattern : ");
		int n = s.nextInt();
		
		for(int i =0;i<n;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
