package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String a = "abcdef fed cb a";
		a = a.replace(" ", "");
		String rev = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			rev += a.charAt(i);
		}

		if (a.equals(rev)) {
			System.out.println("Palindrome");
		}

		else {
			System.out.println("Not a Palindrome");
		}
		/*
		 * boolean palindrome = true; for (int i = 0; i < a.length(); i++) { if
		 * (a.charAt(i) != rev.charAt(i)) { palindrome = false; } }
		 * 
		 * if (palindrome) { System.out.println("PALINDROME"); } else {
		 * System.out.println("The given string is not palindrom"); }
		 * 
		 * /* Pseudo Code
		 * 
		 * a) Declare A String value as"madam"
		 * 
		 * b) Declare another String rev value as "" c) Iterate over the String in
		 * reverse order d) Add the char into rev e) Compare the original String with
		 * the reversed String, if it is same then print palinDrome
		 * 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
		 */

	}

}
