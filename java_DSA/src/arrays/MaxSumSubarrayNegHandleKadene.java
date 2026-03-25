package arrays;

public class MaxSumSubarrayNegHandleKadene {

	public static void Subarray(int arr[]) {
		int currSum = arr[0],maxSum = arr[0];
		for(int i = 1; i< arr.length;i++) {
			currSum = Math.max(arr[i], currSum +arr[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		System.out.println("Maximum Sum of Array : "+maxSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {-4,-2,-7,-1};
		
		Subarray(arr);
	}

}
