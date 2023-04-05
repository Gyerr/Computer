/*
 * Generates a list of prime numbers from lower limit to upper limit set by the user. Counts the number 
 * of all primes generated.
 * 
 * @author Gruhith Yerramalli
 * 
 * @version 4/5/23
 * 
 * PMR
 * ----------------------------------------------------------
 * (+): easy to set up constructor and the static methods in order to loop and count prime numbers
 * 
 * (-): no difficulties but maybe a little with the isPrime method.
 * -----------------------------------------------------------
 * In the Future: Practice more with this and make sure not to set the max limit to integer limit because it takes forever and i gave up after 2million. :)
 */

import java.util.Scanner;

public class PrimeNumber {
    private boolean isValid;

    public PrimeNumber(boolean isValid) {
        this.isValid = isValid;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the lower limit for the prime numbers: ");
        int lowerLimit = in.nextInt();

        System.out.println("Enter the upper limit for the prime numbers(i.e., 25000): ");
        int upperLimit = in.nextInt();

        int count = 0;
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if(isPrime(number)) {
                System.out.println(number);
                count++;
            }

        }

        in.close();

        System.out.println("Number of primes generated: " + count);


    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }
}