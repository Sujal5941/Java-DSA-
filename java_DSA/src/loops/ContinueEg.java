package loops;
import java.util.*;
public class ContinueEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		do {
			int n = s.nextInt();
			if(n%10 == 0) {
				continue;
			}
			System.out.println(n);
		}while(true);
		
	}

}
