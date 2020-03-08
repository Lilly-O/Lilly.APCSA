package Term2.Assignment4;

/* Term 2 Assignment 4 - Fraction Comparable
 * A class which is used to represent fractions and implements
 * the comparable interface
 */
public class Fraction implements Comparable {
    private int numerator;
    private int denominator;

    // Default constructor: creates fraction 1/1
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    // Constructor for fraction n/d where n, d > 0
    public Fraction(int n, int d) {
        this();
        if (n > 0) {
            numerator = n;
        }
        if (d > 0) {
            denominator = d;
        }
        simplify();
    }

    // Compares the fractions to see if they are larger/smaller than the other
    public int compareTo(Object other) {
        Fraction otherFrac = (Fraction) other;
        int thisNum = this.numerator * otherFrac.denominator;
        int otherNum = otherFrac.numerator * this.denominator;

        if (thisNum < otherNum) // Indicates that thisNum is smaller than otherNum
            return -1;
        if (otherNum < thisNum) // Indicates that otherNum is smaller than thisNum
            return 1;
        return 0;
    }

    // Method calls to find the GCD of the numerator and denominator
    public void simplify() {
        int div = gcd(numerator, denominator);
        numerator /= div;
        denominator /= div;
    }

    // Uses Euclidean algorithm to find the greatest common divisor
    public static int gcd(int a, int b) {
        int r = a % b;
        if (r == 0)
            return b;
        return gcd(b, r);
    }

    // Return the fraction as a String e.g. "2/3"
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Return the fraction as a mixed number String
    public String mixedNumber() {
        // If fraction is proper return fraction using toString method
        if (numerator < denominator) {
            return toString();
        }

        // If numerator is a multiple of denominator return just integer part
        if (numerator % denominator == 0) {
            return "" + numerator / denominator;
        }

        // Otherwise return mixed number string
        return numerator / denominator + " " + numerator % denominator + "/" + denominator;
    }

    // Adds the fraction n/d to this fraction if n and d are both greater than 0
    public void add(int n, int d) {
        if (n > 0 && d > 0) {
            numerator = numerator * d + n * denominator;
            denominator *= d;
        }
        simplify();
    }
}
