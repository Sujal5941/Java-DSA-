package arrays;
import java.util.*;
public class TrappedRainwater {

	public static int TrappedWater(int arr[],int width) {
		int trapwater = 0,waterlevel;
		int leftmax[] = new int[arr.length];
		int rightmax[] = new int[arr.length];
		leftmax[0] = arr[0];
		rightmax[arr.length-1] = arr[arr.length-1];
		
		for(int i = 1;i<arr.length;i++) {
			if(leftmax[i-1] > arr[i]) {
				leftmax[i] = leftmax[i-1];
			}else {
				leftmax[i] = arr[i];
			}
		}
		
		for(int i = arr.length-2;i>=0;i--) {
			if(rightmax[i+1] > arr[i]) {
				rightmax[i] = rightmax[i+1];
			}else {
				rightmax[i] = arr[i];
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			waterlevel = Math.min(leftmax[i], rightmax[i]);
			trapwater += ((waterlevel - arr[i]) * width);
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
		
		System.out.println("Trapped Water = "+TrappedWater(arr,width));
	}

}
