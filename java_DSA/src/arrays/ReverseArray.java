package arrays;
import java.util.*;
public class ReverseArray {

	public static int[] ReverseArray(int arr[]) {
		int len = arr.length -1;
		for(int i = 0;i<= len/2;i++) {
			int temp = arr[i];
			arr[i] =arr[len - i];
			arr[len - i] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array Element : ");
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
			}
		
		arr = ReverseArray(arr);
		System.out.println("Reverse Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
