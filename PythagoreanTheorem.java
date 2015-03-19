/*
 * File: PythagoreanTheorem.java
 * Calculates the Pythagorean theorem. Asks user to input a and b, 
 * squares a and b and adds result (subTotal), then finds the square root
 * of subTotal (c).
 * Jeanette Trudell March 11, 2015 jtrudell@gmail.com
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute Pythagreon theorem.");
		int a = readInt("a: ");
		int b = readInt("b: ");
		int subTotal = (a * a) + (b *b);
		double c = Math.sqrt(subTotal);
		println ("c = " + c);
	}
}
