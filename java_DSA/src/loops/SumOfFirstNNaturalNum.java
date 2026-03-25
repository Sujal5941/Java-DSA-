package loops;
import java.util.*;
public class SumOfFirstNNaturalNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int count = 1 ;
		
		System.out.println("Enter N Number : ");
		int n = s.nextInt();
		int sum = 0;
		while(count<=n) {
			sum +=count;
			count ++;
		}
		System.out.println("Sum of first "+n+" number is : "+sum);

	}

}
