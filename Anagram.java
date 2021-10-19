package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a = "stops";
		String b = "potss";
		
		if (a.length()==b.length()) 
		{
			char ab[] = a.toCharArray();
			char cd[] = b.toCharArray();
			Arrays.sort(ab);
			Arrays.sort(cd);
			
			if (Arrays.equals(ab, cd)) {
				System.out.println("ANAGRAM");
			}
			else {
				System.out.println("Not ANAGRAM");
			}
		}
		else
		{
			System.out.println("Not a valid string");
		}
		
			
			/*
			 * Pseudo Code
			  
			 *Declare a String 
				String text1 = "stops";
			 *Declare another String
				String text2 = "potss"; 
			 * a) Check length of the strings are same then (Use A Condition)
			 * b) Convert both Strings in to characters
			 * c) Sort Both the arrays
			 * d) Check both the arrays has same value
			 * 
			 */


	}
}
