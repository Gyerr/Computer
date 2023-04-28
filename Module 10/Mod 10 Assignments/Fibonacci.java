/**
 * 
 * @author Gruhith Yerramalli 
 * @version 4/11/23 
 * PMR 
 * ------------------------------------------------------ 
 * (+): Easy to use recursion and create the public static void method. 
 * (-): A little hard to do the recursion of the integers and generate sequence. Ran into problem of no output created but i realize print statment not in while loop. 
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
 * In the Future: practice mroe recursion and experiment more.
 */
import java.util.Scanner;

public class Fibonacci {

    public static void fibonacciOf () {
        int fibonacci = 1;
        int num1,num2,counter;
        int n;
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a positive integer between 1 - 46 or enter -1 to quit: ");
            n = in.nextInt();

            if (n==-1) 
                System.exit(0);

            else if (n > 46 || n < -1){ 
                System.out.println("Please enter a valid number.");
                fibonacciOf();
            }
            else if (n >= 1) {
                num1 = 1;
                num2 = 1;
                counter = 3;
                while (counter <= n) {
                    fibonacci = num1 + num2;
                    num1 = num2;
                    num2 = fibonacci;
                    counter = counter + 1;
                }

                System.out.println("The Fibonacci of " + n + " is " + fibonacci);  
                
                //this is the line of code that created the error. By deleting this there will be no error and program works flawlessly.
                //in.close(); 

            }
        }
        
    }   


    public static void main (String [] args) {
        fibonacciOf();
    }   
}
