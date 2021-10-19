package week1.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
			String a= "youwilllearnitkeeppractising";
			
				char[] b = a.toCharArray();

				for (int i = 0; i < b.length; i++) {
					
					if (i%2!=0) {
						System.out.print(Character.toUpperCase(b[i]));
					} else {
						System.out.print(b[i]);
					}
				}
		
		
		
		
		
		
		//String test = "changeme";
		//char[] test2 = test.toCharArray();
		//for (int i = 0; i < test2.length; i++) {
			
		//		if(i%2==0) {
		//test.toUpperCase().charAt(i);
		//System.out.println(test2);
			//	}
		
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		}
		
	}
	
