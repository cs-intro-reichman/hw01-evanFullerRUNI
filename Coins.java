/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// takes int from command line for quantity of cents
		int a = Integer.parseInt(args[0]);
		// calculates number of quarters and cents from int a
		int quarters = a / 25;
		int cents = a % 25;
		// prints number of quarters and cents to use
		System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}