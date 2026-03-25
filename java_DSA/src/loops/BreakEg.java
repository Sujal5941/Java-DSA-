package loops;
import java.util.*;

public class BreakEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1;i<=100;i++) {
//			if(i % 10 == 0) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		Scanner s = new Scanner(System.in);
		do {
			int n= s.nextInt();
			if(n % 10 == 0) {
				break;
			}
			System.out.println(n);
		}while(true);
		System.out.println("Entered Number multiply by 10");
	}

}
