package pattern2;

import java.util.*; 
public class ZeroOneTriangle {

	public static void ZeroOneTriangle(int n ) {
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				if((i+j)% 2 == 0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N for 0-1 Triangle Pattern : ");
		int n = s.nextInt();
		
		ZeroOneTriangle(n);
	}

}
