public class RiverValley extends Valley {
    private double riverLength;

    public RiverValley (int l, int w, double d, double rl) {
        super(l, w, d);
        riverLength = rl;

    }

    public double getLength () {
        return riverLength;
    }
}
