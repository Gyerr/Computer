package Catapult;

/**
 * Project title: 08.05 CatapultTester
 *
 * Purpose of Project: Calculates the trajectory of a projectile based on launch angles and launch velocities.
 *
 * @version 3/8/2023
 *
 * @author Gruhith Yerramalli
 * 
 * *********** PMR ***********
 * (+) Understood OOP more.
 * (+) Had good understanding of for loops and used lots of intuition to fill the 2D array
 *
 * (-) Need more practice with OOP.
 * 
 * ***************************
 *
 * In the future: Practice more and use more OOP.
 */

public class CatapultTester {
    public static void main (String[] args) {
        int[] speedArray = new int[7];
        int[] angleArray = new int[7];
        double[][] catapults = new double[7][7];
        Catapult catapult = new Catapult();

        int j = 0;
        for (int i = 0; i < speedArray.length; i++) {
            speedArray[i] = j + 20;
            j += 5;
        }

        int k = 0;
        for (int i = 0; i < angleArray.length; i++) {
            angleArray[i] = k + 20;
            k += 7;
        }        

        for (int row = 0; row < catapults.length; row++)
    {
        // NOTE: technically Encrypt.length works here since it's a square
        // 2D array, but you should really loop until Encrypt[row].length
        for (int column = 0; column < catapults[row].length; column++)
        {
            // NOTE: set each entry to the desired char value
            catapults[row][column] = (double)Math.round(catapult.calcDistance(speedArray[row], angleArray[column]) * 100) / 100;
        }
    }
        //for(int i = 0; i < catapults.length; i++) {
        //    for (int l = 0; l < catapults.length; l++) {
        //        System.out.println(catapults[i][l]);
        //    }
        //}
        
        System.out.println("                      Projectile Distance (feet)                      ");
        System.out.println("MPH   20 Deg     27 Deg     34 Deg     41 Deg     48 Deg     55 Deg     62 Deg    ");
        System.out.println();
        System.out.println("==================================================================================="); 

        for (int i = 0; i < catapults.length; i++) {
            System.out.printf("%2s    ", speedArray[i]);
            for (int column = 0; column < catapults.length; column++) {
                System.out.printf("%-7s    ", catapults[i][column]);
            }
            System.out.printf("\n\n");
        }

    }
}
