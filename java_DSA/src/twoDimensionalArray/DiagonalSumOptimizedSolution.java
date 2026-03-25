package twoDimensionalArray;
import java.util.*;
public class DiagonalSumOptimizedSolution {

	public static int DiagonalSum(int arr[][]) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			// Primary Diagonal
			sum += arr[i][i];
			
			//Secondary Diagonal
			if(i != arr.length-1-i) {
				sum += arr[i][arr.length -1-i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N for the Size of array (n*n) : ");
		int n =s.nextInt();
		int arr[][] = new int[n][n];
		
		System.out.println("Enter the Array Element :");
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Diagonal Sum : "+DiagonalSum(arr));
	}

}
