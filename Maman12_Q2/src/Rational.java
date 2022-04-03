
public class Rational {

	private int numerator;
	private int denominator;

	// Constructor for the rational number.
	public Rational(int numerator, int denominator) {
		if (denominator > 0) {
			this.numerator = numerator;
			this.denominator = denominator;
		} else {
			throw new IllegalArgumentException("Invalid numbers (" + denominator + ")");
		}
	}

	// Return the numerator of the number on which the method is applied on.
	public int getNumerator() {
		return this.numerator;
	}

	// Return the denominator of the number on which the method is applied on.
	public int getDenominator() {
		return this.denominator;
	}

	// Return the largest common divider of numerator & denominator of the number on
	// which the method is applied on.
	private static int gcd(int num, int denom) {
		if (denom != 0) {
			return gcd(denom, (num % denom));
		}
		return num;
	}

	// Return the reduce of the number on which the method is applied on.
	public Rational reduce() {
		int largestCommonDivider = gcd(this.getNumerator(), this.getDenominator());
		int resNumerator = (this.getNumerator() / largestCommonDivider);
		int resDenominator = (this.getDenominator() / largestCommonDivider);
		if (resDenominator < 0) {
			resDenominator = -resDenominator;
			resNumerator = -resNumerator;
		}
		Rational res = new Rational(resNumerator, resDenominator);
		return res;
	}

	// Checks whether the number on which the method is applied on, is greater than
	// num. Return true if it is & false if not.
	public boolean greaterThan(Rational num) {
		if ((this.getNumerator() * num.getDenominator()) > (this.getDenominator() * num.getNumerator())) {
			return true;
		}
		return false;
	}

	// Checks whether the number on which the method is applied on, is equals to
	// num. Return true if it is & false if not.
	public boolean equals(Rational num) {
		if ((this.getNumerator() * num.getDenominator()) == (this.getDenominator() * num.getNumerator())) {
			return true;
		}
		return false;
	}

	// Return the sum of num & the number on which the method is applied on.
	public Rational plus(Rational num) {
		int resNumerator = ((this.getNumerator() * num.getDenominator())
				+ (this.getDenominator() * num.getNumerator()));
		int resDenominator = (this.getDenominator() * num.getDenominator());
		Rational res = new Rational(resNumerator, resDenominator);
		return res.reduce();
	}

	// Return the difference between the number on which the method is applied on &
	// num.
	public Rational minus(Rational num) {
		int resNumerator = ((this.getNumerator() * num.getDenominator())
				- (this.getDenominator() * num.getNumerator()));
		int resDenominator = (this.getDenominator() * num.getDenominator());
		Rational res = new Rational(resNumerator, resDenominator);
		return res.reduce();
	}

	// Return the number on which the method is applied on double num.
	public Rational multiply(Rational num) {
		int resNumerator = (this.getNumerator() * num.getNumerator());
		int resDenominator = (this.getDenominator() * num.getDenominator());
		Rational res = new Rational(resNumerator, resDenominator);
		return res.reduce();
	}

	// Return the number on which the method is applied on divide by num.
	public Rational divide(Rational num) {
		int resNumerator = (this.getNumerator() * num.getDenominator());
		int resDenominator = (this.getDenominator() * num.getNumerator());
		if (resDenominator == 0) {
			throw new ArithmeticException("Can't divide by zero");
		}
		Rational res = new Rational(resNumerator, resDenominator);
		return res.reduce();
	}

	// Return String representation of the rational number.
	public String toString() {
		return numerator + "/" + denominator;
	}
}
