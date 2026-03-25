package pattern2;
import java.util.*;

public class SolidRhombus {
	
	public static void solidRhombus(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1 ;j<=(2*n)-i;j++) {
				if(j <= n-i) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter n for printing the Solid Rhombus : ");
		int n = s.nextInt();
		
		solidRhombus(n);
	}

}
