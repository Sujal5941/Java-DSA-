package arrays;

public class MaxSubArraySumKadaneAlgo {

	public static void SubArray(int arr[]) {
		int maxSum = Integer.MIN_VALUE,currSum = 0;
		for(int i = 0;i<arr.length;i++) {
			currSum += arr[i];
			maxSum = Math.max(currSum,maxSum);
//			if(maxSum < currSum) {
//				maxSum = currSum;
//			}
//			
			if(currSum < 0) {
				currSum = 0;
			}
		}
		System.out.println("Maximum Sum of Subarray : "+maxSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		
		SubArray(arr);
	}

}
