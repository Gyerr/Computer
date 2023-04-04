
public class HyperRectangle extends Box4{
    int length4;
    
    public HyperRectangle(int l1, int l2, int l3, int l4){
        super(l1, l2, l3);
        
        this.length4 = l4;
    }

    public String getName () {
        return "HyperRectangle";
    }

    public String toString(){
        return "The HyperRectangle's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + this.length4;
    }
    
    public int getLength4(){
        return this.length4;
    }
    
    public String equals(HyperRectangle rect){
        if (getLength() == rect.getLength() && getWidth() == rect.getWidth() && getHeight() == rect.getHeight() && getLength4() == rect.getLength4()) {
            return getName() + " - " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + getLength4() + " IS same size as " + getName() + " " + rect.getLength() + " X " + rect.getWidth() + " X " + rect.getHeight() + " X " + rect.getLength4(); 
        }
        else {
            return getName() + " - " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + getLength4() + " IS NOT the same size as " + getName() + " " + rect.getLength() + " X " + rect.getWidth() + " X " + rect.getHeight() + " X " + rect.getLength4(); 
        }
    }


}