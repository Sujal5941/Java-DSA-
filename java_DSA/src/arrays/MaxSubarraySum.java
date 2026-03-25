//Brute Force Maximum Subarray

package arrays;

public class MaxSubarraySum {

	public static void Subarray(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		for(int i  = 0;i< arr.length;i++) {
			for(int j = i;j < arr.length;j++) {
				int sum =0;
				for(int k = i; k<=j;k++) {
					sum +=arr[k];
				}
				
				if(maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		System.out.println("Maximum Sum of Subarray = "+ maxSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, -2, 6, -1, 3};
		
		Subarray(arr);
	}

}
