package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {

		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				int length = arr.length;
				System.out.println("Length of my Array:" +length);
				
				Arrays.sort(arr);
				System.out.println("Last Element of Array" +arr[length-1]);
				System.out.println("First Element of Array: "+arr[0]);
								
				for (int i = 1; i <= arr.length; i++)
				{
					if (i!=arr[i-1]) {
					System.out.println(i);
					break;
					}
				}
				
				
				/*for (int i = arr.length-1; i >= 0; i--)
				{
					System.out.println(arr[i]);
					
					
				} */
				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
				
						// print the number// once printed break the iteration
	}

}
