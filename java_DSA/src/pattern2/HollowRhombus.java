package pattern2;
import java.util.*;


//for(int i = 1; i <= n; i++) {
//
//    for(int j = 1; j <= 2*n-i; j++) {
//
//        if(j <= n - i) {
//            System.out.print("  ");
//        }
//        else {
//            if(i == 1 || i == n || 
//               j == n - i + 1 || 
//               j == 2*n - i) {
//
//                System.out.print("* ");
//            } else {
//                System.out.print("  ");
//            }
//        }
//    }
//
//    System.out.println();
//}


public class HollowRhombus {

    public static void HollowRhomb(int n) {
    	for(int i =1;i<=n;i++) {
    		for(int j =1;j<= 2*n-i;j++) {
    			if(j<=n-i) {
    				System.out.print("  ");
    			}
    			else {
    				if(i == 1 || i == n ||
    						j == n-i+1 || j == 2*n-i ) {
    					System.out.print("* ");
    				}
    				else
    				{
    					System.out.print("  ");
    				}
    			}
    		}
    		System.out.println();
    	}
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = s.nextInt();
        
        HollowRhomb(n);
    }
}