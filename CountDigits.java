/**
 * Program: CountDigits
 *
 * Aim:
 * To determine the number of digits in an integer without
 * converting it into a string.
 *
 * Algorithm:
 * 1. Read the integer n.
 * 2. If n is 0, the number of digits is 1.
 * 3. If n is negative, convert it to its absolute value using Math.abs().
 * 4. Initialize a variable count = 0.
 * 5. Repeat until n becomes 0:
 *    - Divide n by 10.
 *    - Increment count by 1.
 * 6. Display count.
 */

import java.util.Scanner;

public class CountDigits {

    /**
     * Reads an integer from the user and prints
     * the number of digits in it.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Digits = 1");
            return;
        }

        // Convert negative numbers to positive.
        n = Math.abs(n);

        int count = 0;

        /*
         * Working Principle:
         * Every division by 10 removes the last digit.
         * The number of divisions required for the number
         * to become 0 equals the number of digits.
         */
        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Digits = " + count);
    }
}