package arrays;
import java.util.*;
public class TrappedWaterTwoPointer {

	public static int TrapedWater(int arr[],int width) {
		int left = 0,right = arr.length-1,leftmax =0,rightmax = 0,trapwater=0;
		
		while(left<=right) {
			if(arr[left]<arr[right]) {
				leftmax = Math.max(leftmax, arr[left]);
				trapwater += ((leftmax - arr[left])*width);
				left++;
			}
			else {
				rightmax = Math.max(rightmax, arr[right]);
				trapwater +=((rightmax - arr[right])*width);
				right--;
			}
		}
		return trapwater;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of bar : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the width of the bar: ");
		int width = s.nextInt();
		System.out.println("Enter the bar size : ");
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("Trapped Water = "+TrapedWater(arr,width));
	}

}
