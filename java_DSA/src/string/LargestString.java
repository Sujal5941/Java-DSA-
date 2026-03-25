package string;

public class LargestString {

	public static void main(String[] args) {
		
		String arr[] = {"apple","banana","mango"};
		String largest = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if((arr[i]).compareTo(largest) > 0) {		// we can use comapreToIgnoreCase so capital small letter doesnot have nay effect on the answer 
				largest = arr[i];
			}
		}
		
		System.out.println("The Largest String is : "+largest);
	}

}
