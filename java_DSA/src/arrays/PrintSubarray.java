package arrays;
import java.util.*;
public class PrintSubarray {

	public static void Subarray(int arr[]) {
		int tp = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++) {
			for(int j = i; j< arr.length;j++) {
				int sum = 0;
				System.out.print("[");
				for(int k = i; k<=j;k++) {
					System.out.print(arr[k]+" ");
					sum +=arr[k];
				}
				if(min>sum) {			// If for Calculating the Min Sum of Subarray
				min = sum;
				}
				if(max<sum) {			// If for Calculating the Max Sum of Subarray
					max = sum;
				}
				
				tp++;		// Calculating total no of Subarray
				System.out.print("] ");
				System.out.println("sum = "+sum);   // printing sum of each subarray.
			}
			System.out.println();
		}
		System.out.println("Total Subarray : "+tp);
		System.out.println("Maximum Sum of Subarray : "+max);		// printing max sum of subarray.
		System.out.println("Minimum Sum of Subarray : "+min);		// printing min sum of subarray.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the array Size : ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array element : ");
		for(int i =0;i< n ;i++) {
			arr[i] = s.nextInt();
		}
		
		Subarray(arr);
	}

}
