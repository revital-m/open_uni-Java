import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] numsFormUserArr = new int[4];
		System.out.println("Please enter the numerator & denominator for two numbers: ");
		int i = 0;
		while (i < 4) {
			Scanner number = new Scanner(System.in);
			if ((i % 2) == 0) {
				System.out.println("Numerator: ");
			} else {
				System.out.println("Denominator: ");
			}

			int num = number.nextInt(); // Read user input
			if (((i % 2) == 1) && !(num > 0)) {
				System.out.println("Denominator must be a positive number! ");
			} else {
				numsFormUserArr[i] = num;
				i++;
			}
		}

		Rational firstRationalNum = new Rational(numsFormUserArr[0], numsFormUserArr[1]);
		System.out.println("firstRationalNum: " + firstRationalNum.toString() + ", numerator: "
				+ firstRationalNum.getNumerator() + ", denominator: " + firstRationalNum.getDenominator());

		Rational secondRationalNum = new Rational(numsFormUserArr[2], numsFormUserArr[3]);
		System.out.println("secondRationalNum: " + secondRationalNum.toString() + ", numerator: "
				+ secondRationalNum.getNumerator() + ", denominator: " + secondRationalNum.getDenominator());

		System.out.println("Greater Than: " + firstRationalNum.toString() + " > " + secondRationalNum.toString() + " = "
				+ firstRationalNum.greaterThan(secondRationalNum));

		System.out.println("Equals: " + "Is " + firstRationalNum.toString() + " equals to "
				+ secondRationalNum.toString() + " = " + firstRationalNum.equals(secondRationalNum));

		System.out.println("Plus: " + firstRationalNum.toString() + " + " + secondRationalNum.toString() + " = "
				+ firstRationalNum.plus(secondRationalNum).toString());

		System.out.println("Minus: " + firstRationalNum.toString() + " - " + secondRationalNum.toString() + " = "
				+ firstRationalNum.minus(secondRationalNum).toString());

		System.out.println("Multiply: " + firstRationalNum.toString() + " * " + secondRationalNum.toString() + " = "
				+ firstRationalNum.multiply(secondRationalNum).toString());

		System.out.println("Divide: " + firstRationalNum.toString() + " / " + secondRationalNum.toString() + " = "
				+ firstRationalNum.divide(secondRationalNum).toString());

		System.out.println("Reduce: " + firstRationalNum.toString() + " = " + firstRationalNum.reduce().toString());

	}
}
