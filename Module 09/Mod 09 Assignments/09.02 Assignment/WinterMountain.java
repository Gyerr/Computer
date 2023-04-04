public class WinterMountain extends Mountain {
    private double temperature;

    public WinterMountain (int l, int w, int number, double t) {
        super(l, w, number);
        temperature = t;
    }
    
    public double getTemperature () {
        return temperature;
    }
}
