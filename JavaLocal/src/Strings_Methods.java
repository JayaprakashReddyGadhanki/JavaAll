
public class Strings_Methods {

	public static void main(String[] Args) {

		String s = "Geek@for@Geeks@example";
		String s1 = "GeekforGeeks";
		String s2 = new String("GeekforGeeks");
		String s3 = new String("GeekforGeeks");

		// Get the length of the string
		System.out.println(s.length());

		//
		System.out.println("Substring " + s.substring(4));

		// Returns the character at ith index.
		System.out.println(s.charAt(7));

		// Returns the substring from i to j-1 index.
		System.out.println(s.substring(4, 7));

		// equals() compare the actual value of the string.
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // false
		System.out.println(s2.equals(s3));// true

		// Convert to char Array

		char charArray[] = s.toCharArray();

		for (char c : charArray) {

			System.out.println(c);
		}

		// split array
		String strArray[] = s.split("@");
		for (String string : strArray) {
			System.out.println(string);
		}

	}

}
