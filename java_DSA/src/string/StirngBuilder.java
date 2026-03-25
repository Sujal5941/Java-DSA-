package string;

public class StirngBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		
		// Append
		sb.append(" World");
		System.out.println(sb);
		
		// length
		System.out.println(sb.length());
		
		// character access
		System.out.println(sb.charAt(1));
		
		// Modify character
		sb.setCharAt(0, 'h');
		System.out.println(sb);
		
		// Insert
		sb.insert(5, " Java");
		System.out.println(sb);
		
		//Delete
		sb.delete(5, 10);
		System.out.println(sb);
	}

}
