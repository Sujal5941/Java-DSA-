package twoDimensionalArray;
import java.util.*;
public class DiagonalSumBruteForceApproach {

	public static int DiagonalSum(int arr[][]) {
		int sum =0;
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				
				//Primary Diagonal
				if(i == j) {
					sum += arr[i][j];
				}
				// Handles the repeated daigonal values automatically 
//				else if(i+j == arr.length-1){
//					sum += arr[i][j];
//				}
				if(i+j == arr.length - 1 && i != j) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N for array size(n*n) : ");
		int n = s.nextInt();
		int arr[][] = new int[n][n];
		System.out.println("Enter the array Element : ");
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Diagonal Sum : "+DiagonalSum(arr));
	}

}
