package string;

public class FirstLetterCapitalize {

	public static String Capitalize(String str) {
		StringBuilder sb = new StringBuilder("");
		sb.append(Character.toUpperCase(str.charAt(0)));  // convert first character of String to uppercase.
		for(int i = 1;i< str.length();i++) {
			if(str.charAt(i) ==' ' && i < str.length() - 1) {
				sb.append(" ");
				sb.append(Character.toUpperCase(str.charAt(++i)));
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi, i am sujal";
		System.out.println("Capitalize String : "+Capitalize(str));
	}

}
