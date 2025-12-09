package Skillbuilders.RecursiveFactorial;



 import java.util.Scanner;

 /**
  * displays the factorial of a number
  */
 public class RecursiveFactorial {

 	/**
 	 * Returns the factorial of a number
 	 * pre: none
 	 * post: the factorial of num has been returned
 	 */
 	public static int factorial(int num) {
 		int result = num;

 		if (num == 0) {
 			result = 1;
 		} else if (num >= 1) {
 			result *= factorial(num - 1);
 		}
 		return(result);
 	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fact;

		System.out.print("Enter an integer: ");
		fact = input.nextInt();
		System.out.println("The factorial of " + fact + " is " + factorial(fact));
	}
}