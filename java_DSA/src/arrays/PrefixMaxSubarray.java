package arrays;

public class PrefixMaxSubarray {

	public static void MaxSubarray(int arr[]) {
		int maxSum = Integer.MIN_VALUE,currSum = 0;
		
		//Calculating prefix array
		int prefixArr[] = new int[arr.length];
		prefixArr[0] = arr[0];
		for(int i = 1;i<arr.length;i++) {
			prefixArr[i] = prefixArr[i-1] + arr[i];
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i;j<arr.length;j++) {
				
				currSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
				
				if(maxSum < currSum) {
					maxSum = currSum;
				}
			}
		}
		System.out.println("Maximum Sum Of Subarray : "+maxSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, -2, 6, -1, 3};
		
		MaxSubarray(arr);
	}

}
