/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// reads two ints from command line
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// prints the resulting equation
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}