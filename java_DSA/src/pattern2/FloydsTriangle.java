package pattern2;
import java.util.*;
public class FloydsTriangle {
	
	public static void floydTriangle(int n) {

//		Using formula 
		for(int i =1 ;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(((i*(i-1)/2)+j)+" ");
			}
			System.out.println();
		}
		
		
//		" Using Counter "
//		int counter=1;
//		for(int i = 1;i<=n;i++) {
//			for(int j = 1;j<=i;j++) {
//				System.out.print(counter+" ");
//				counter ++;
//			}
//			System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number N for Flyod's Trianlge : ");
		int n = s.nextInt();
		
		floydTriangle(n);
	}

}
