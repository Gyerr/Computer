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

        System.out.println("Number of primes generated: " + count);


    }

    public static boolean isPrime(int number) {
        for (int i = lowerLimit; i < number; i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }
}