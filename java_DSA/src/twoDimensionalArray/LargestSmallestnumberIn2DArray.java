package twoDimensionalArray;
import java.util.*;
public class LargestSmallestnumberIn2DArray {

	public static int FindMaxNum(int arr[][]) {
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	public static int FindMinNum(int arr[][]) {
		int min = Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++) {
			for(int j= 0;j<arr[0].length;j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of rows : ");
		int n = s.nextInt();
		System.out.println("Enter the Number of columns : ");
		int m = s.nextInt();
		
		int arr[][] = new int[n][m];
		System.out.println("Enter the Array Element :");
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<m;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Minimum Number in Array : "+FindMinNum(arr));
		System.out.println("Maximum Number in Array : "+FindMaxNum(arr));
	}

}
