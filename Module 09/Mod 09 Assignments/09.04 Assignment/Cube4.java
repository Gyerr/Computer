public class Cube4 extends Box4 {
    public Cube4 (int l) {
        super(l, l, l);
    }

    public String getName () {
        return "Cube";
    }

    public String toString() {
        return "The cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight(); 
    }
}