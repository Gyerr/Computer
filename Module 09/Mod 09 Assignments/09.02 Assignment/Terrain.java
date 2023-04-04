/**
 * This class defines a basic Terrain.
 *
 * @author (Gruhith Yerramalli)
 * @version (3/22/2023)
 * 
 * PMR:
 * --------------------------------------
 * (+): Easy to extend the classes and implement the getter method.
 * Easy to make classes with new parameters.
 * 
 * (-): Forgot I could invote getTerrainSize on Terrain.java, but eventually figured it out.
 * Initialize variables first.
 * -------------------------------------------------
 * In the Future: Practice more with this and maybe do a solo project.
 * 
 */

public class Terrain
{
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize()
    {
        return "Land has dimensions " + length + " X " + width;
    }
}
