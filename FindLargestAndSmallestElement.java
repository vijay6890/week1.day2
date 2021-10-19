package week1.day2;

import java.util.Arrays;

public class FindLargestAndSmallestElement {
	
	//Initialize the array
	//Get the length of the array
	//Display the array
	//Sort and display the array
	//Choose the second largest number using the appropriate index
	//Choose the second lowest number using the appropriate index
	
	public static void main(String[] args) {
		int[] testarr = {5, 10, 44, 232, 60, 55, 1, 90};
		
		int length = testarr.length;
		System.out.println("Length of my array is:" +length);
		
		//Get the length of the array
		System.out.println("Use For loop to print all the elements");
		for (int i = 0; i < testarr.length; i++) {
			System.out.println(testarr [i]);
		}
		//first element of array
		System.out.println("First Element");
			System.out.println(testarr[0]);
			
		//last element of array
			System.out.println("Last Element");
			System.out.println(testarr[length-1]);
			
		//pre-last element of array
			System.out.println("Pre-Last Element");
			System.out.println(testarr[length-2]);
			
		//display the array
			
			//sorting of array
			System.out.println("Array Sorting");
			Arrays.sort(testarr);
			System.out.println(testarr[length-1]);
			System.out.println(testarr[length-2]);
			System.out.println(testarr[2]);
		}
	}
	
