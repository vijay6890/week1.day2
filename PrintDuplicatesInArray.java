package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		// Here is the input
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
				{
					System.out.println(arr[i]);
				  	++count;
			}

		}
		
	}
		System.out.println("We totally have "+count+" duplicates; The culprits are above :)");
}
}
