package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] arr = { 3, 2, 11, 4, 6, 7 };
		int length = arr.length;
		Arrays.sort(arr);
		System.out.println("Second Largest number in Array is:" + arr[length - 2]);
	}
}
