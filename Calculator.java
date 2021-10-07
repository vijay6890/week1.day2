package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AssignmentCalculator obj = new AssignmentCalculator();
		
		System.out.println("LOVELY CALCULATOR");
		System.out.println("**************************");
		System.out.println("");
		System.out.println("Sum of Three numbers: "+obj.add());
		System.out.println("Subtraction of two numbers: "+obj.subtract());
		System.out.println("Multiplication of two numbers: "+obj.multiply());
		System.out.println("Division of two numbers: "+obj.divide());
		System.out.println("");
		System.out.println("Hope you enjoyed your time during this caluclation, Happy Coding :)");
		System.out.println("***************************************************************************");
	}

}

/*
	 * -- Create a class "Calculator" with below methods (a) add(int num1, int num2,
	 * int num3), it should return sum of num1+num2+num3 (b) sub(int num1, int
	 * num2), it should return subtraction of of num1-num2 (c) mul(double num1,
	 * double num2), it should return product of num1 * num2 (d) divide(float num1,
	 * float num2), it should return division of num1 / num2
	 * 
	 * -- Create another class as MyCalculator and call all the methods from
	 * Calculator and print the results
	 */
