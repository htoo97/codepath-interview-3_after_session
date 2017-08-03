/* Square Root of Integer */
/*
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x.
 *
 * If x is not a perfect square, return floor(sqrt(x))
 */

public class Solution {
    public int sqrt(int a) {
        double x = a;
        double g = 1;
        double diff = 0.001;

        while (x - g > diff) {
            x = (x + g) / 2;
            g = a / x;
        }

        return (int) x;
    }
}

