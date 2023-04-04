/**
 * 
 * @author: Gruhith Yerramalli
 * @version: 3/22/2023
 * 
 * PMR:
 * -------------------------------------------------
 * (+): Implementing the getter for class name was easy and so was creating and instantiating the objects. 
 * Arraylist was very easy to use as I was used to it. Felt good.
 * 
 * (-): Had a little trouble with the loop for the arraylist as I wasn't too sure how to print the results and then realized how to do it. 
 * 
 */
import java.util.ArrayList;

public class ShapesTester {
    public static void showCenter (Circle2 c) {
        System.out.println("For this " + c.getName() + " the " + c.getCenter() + ".");
    }
    public static void main (String[] args) {
        Circle2 circle = new Circle2(3, 1, 8);
        Circle2 cylinder = new Cylinder2(2, 5, 5, 11);
        Circle2 oval = new Oval2(5, 5, 7, 9);
        Circle2 ovalCylinder = new OvalCylinder2(8, 6, 13, 17, 12);

        ArrayList <Circle2> shapes = new ArrayList<Circle2>();
        shapes.add(0, circle);
        shapes.add(1, cylinder);
        shapes.add(2, oval);
        shapes.add(3, ovalCylinder);

        for (int i = 0; i < shapes.size(); i++) {
            showCenter(shapes.get(i));
        }
    }   
}
