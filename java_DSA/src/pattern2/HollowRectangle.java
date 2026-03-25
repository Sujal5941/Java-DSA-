package pattern2;
import java.util.*;
public class HollowRectangle {

	public static void HollowRectangle(int row,int col) {
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=col;j++) {
				if (i==1 || j==1 || i==row || j==col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the row for Hollow Rectangle : ");
		int row = s.nextInt();
		System.out.println("Enter the col for Hollow Rectangle : ");
		int col = s.nextInt();
		
		
		HollowRectangle(row,col);
	}

}
