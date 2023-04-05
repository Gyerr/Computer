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

    //main class to loop and display prmes
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //after scanner created, ask questions for lower and upper limit
        System.out.println("Enter the lower limit for the prime numbers: ");
        int lowerLimit = in.nextInt();

        System.out.println("Enter the upper limit for the prime numbers(i.e., 25000): ");
        int upperLimit = in.nextInt();

        //count to display # of primes
        int count = 0;

        //loop to find if numbers are prime in between limits and prints number if it is prime and iterates count by 1 to display # of primes
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if(isPrime(number)) {
                System.out.println(number);
                count++;
            }

        }

        in.close();

        //display # of primes generated
        System.out.println("Number of primes generated: " + count);


    }

    //method to calculate if # is prime or not, takes in the number that is being iterated.
    public static boolean isPrime(int number) {

        //i must be 2 because 2 is lowest prime.
        for (int i = 2; i < number; i++) {

            //checks if there is no remainder and if true, isPrime is returned as false as the # is not prime. 
            if (number%i == 0) {
                return false;
            }
        }

        //returns true if the loop doesn't return as false, acts as an else statement without the else.
        return true;
    }
}