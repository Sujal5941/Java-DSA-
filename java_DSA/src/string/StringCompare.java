package string;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		if(str1 == str2) {
			System.out.println("String is equal.");
		}
		
		if(str1 == str3) {		// use (str1.equals(str3) as str3 is different object in heap and str1 is object pointer in String Pool)
			System.out.println("String is equal.");
		}else {
			System.out.println("String is not equal.");
		}
		
		// CompareTo function
		int n = "apple".compareTo("banana");
		System.out.println(n);
		n = "cat".compareTo("cat");
		System.out.println(n);
		n = "dog".compareTo("cat");
		System.out.println(n);
		
	}

}
