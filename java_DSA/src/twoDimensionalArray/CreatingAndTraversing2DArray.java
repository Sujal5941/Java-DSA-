package twoDimensionalArray;
import java.util.*;
public class CreatingAndTraversing2DArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows for 2D Array : ");
		int n = s.nextInt();
		System.out.println("Enter the Number of Columns for 2D Array : ");
		int m = s.nextInt();
		
		int matrix[][] = new int[n][m];
		System.out.println("Enter the Matrix Element : ");
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				matrix[i][j] = s.nextInt();
			}
		}
		
		//Traversing an 2D Array
		System.out.println(" 2D Matrix :");
		for(int i = 0;i< matrix.length;i++) {
			for(int j = 0; j<matrix[0].length;j++) {
				
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
