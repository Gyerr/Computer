/**
 * 
 * 
 * @author Gruhith Yerramalli
 * @version 3/24/2023
 * 
 * PMR:
 * ---------------------------------------------------------
 * (+): It was easy to override toString and create the new implementation classes.
 * Calling them in main class and setting up main class was relatively easy.
 * 
 * (-): Difficult to decide on return type for .equals method. 
 * Creating new implementation classes was slighty challenging as I didn't know which shapes to pick. 
 * ----------------------------------------------------------
 * In the future: practice more polymorphism, overriding, and inheritance as it is very useful.
 * 
 */
import java.util.ArrayList;

public class ShapesTester4 {
    public static void main (String[] args) {
        Rectangle4 one = new Rectangle4(5, 7);
        Box4 two = new Box4(6, 6, 6);
        Box4 three = new Cube4(6);
        HyperRectangle four = new HyperRectangle(5, 7, 4, 3);
        Rectangle4 five = new HyperCube(9);
        Box4 six = new Box4(12, 7, 3);
        HyperRectangle seven = new HyperRectangle(5, 7, 4, 3);


               //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);
        shapes.add(six);
        shapes.add(seven);


        for(Rectangle4 rect: shapes)
        {
        	System.out.println(rect);
        	showEffectBoth(rect);
            System.out.println();
        }

        System.out.println();
        System.out.println(four.equals(seven));
        System.out.println();
        System.out.println(three.equals(six));
    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }
    
}
