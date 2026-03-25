package arrays;

public class CheckIfTheArrayIsSorted {

	public static int Sorted(int arr[]) {
		int count = 0;
		for(int i = 0;i<arr[i];i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
		}
		if(arr[0] < arr[arr.length-1]) {
			count ++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,7,1,2,3,4,5};
		int isSorted = Sorted(arr);
		
		if(isSorted > 1) {
			System.out.println("Not Sorted");
		}else {
			System.out.println("Sorted");
		}
	}

}
