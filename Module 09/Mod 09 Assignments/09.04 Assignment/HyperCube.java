public class HyperCube extends HyperRectangle{
   
    public HyperCube (int l){
        super(l, l, l, l);
    }

    public String toString(){
        return "The HyperCube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + getLength4();
    }

    public String getName () {
        return "HyperCube";
    }
    
    
}
