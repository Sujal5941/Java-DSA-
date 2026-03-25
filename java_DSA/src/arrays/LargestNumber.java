package arrays;
import java.util.*;
public class LargestNumber {

	public static int largestNum(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter n for Number of element in array : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array Element : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		int largestNum = largestNum(arr);
		
		System.out.println("The Largest Number of array is "+largestNum);
		
	}

}
