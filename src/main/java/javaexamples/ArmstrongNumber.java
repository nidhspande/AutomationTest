package javaexamples;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// Declare Integers

		int a = 407;
		int b;
		int c;
		int d = 0;

		// Tell Java to make number equal to num

		b = a; // 407

		while (b != 0) {
			c = b % 10; // 7 //
			d = d + c * c * c; // 343
			// number /=10;/// 40

			b = b / 10; // 40

		}
		if (d == a)
			System.out.println(a + " is an Armstrong number");
		else
			System.out.println(a + "is not an Armstrong number");

	}

}
