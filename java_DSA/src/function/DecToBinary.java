package function;
import java.util.*;
public class DecToBinary {

	public static int DecToBin(int n) {
		int lastdigit = 0;
		int BinNum = 0;
		int place =1;
		while(n>0) {
			lastdigit = n % 2;
			BinNum = BinNum + (lastdigit * place);
			n /= 2;
			place *= 10;
		}
		return BinNum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Binary Number : ");
		int n = s.nextInt();
		
		int BinaryNumber = DecToBin(n);
		
		System.out.println("Binary of "+n+" is : "+BinaryNumber);
	}

}
