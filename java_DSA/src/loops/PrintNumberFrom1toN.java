package loops;
import java.util.*;
public class PrintNumberFrom1toN {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int count = 1;
		
		System.out.println("Enter N : ");
		int n = s.nextInt();
		
		while(count<=n) {
			System.out.print(count+" ");
			count ++;
		}
	}

}
