package arrays;

public class ArrayFunctionArguments {

	public static void Update(int[] marks,int unchange) {
		unchange = 100;
		for(int i =0;i< marks.length;i++) {
			marks[i] = marks[i]+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {95,98,92};
		int unchange = 90;			
		Update(marks,unchange);
		System.out.println(unchange);
		for(int i =0;i<marks.length;i++) {
			System.out.print( marks[i]+" ");
		}
	}

}
