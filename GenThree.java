/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// takes ints for the bounds from commmand line
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]) - min;
		// generates three random ints
		int num1 = (int) (Math.random() * max) + min;
		int num2 = (int) (Math.random() * max) + min;
		int num3 = (int) (Math.random() * max) + min;
		// tests for minimum integer
		int minFirst = Math.min(num1, num2);
		int minFinal = Math.min(minFirst, num3);
		// prints values and minimum
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("The minimal generated number was " + minFinal);
	}
}
