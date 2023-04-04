/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    public String getName () {
        return "Box";
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

    public String equals (Box4 rect) {
        if (getLength() == rect.getLength() && getWidth() == rect.getWidth() && getHeight() == rect.getHeight()) {
             return getName() + " - " + getLength() + " X " + getWidth() + " X " + getHeight() + " IS same size as " + getName() + " " + rect.getLength() + " X " + rect.getWidth() + " X " + rect.getHeight(); 
        }
        else {
            return getName() + " - " + getLength() + " X " + getWidth() + " X " + getHeight() + " IS NOT the same size as " + getName() + " " + rect.getLength() + " X " + rect.getWidth() + " X " + rect.getHeight(); 
        }
    }
    
}
