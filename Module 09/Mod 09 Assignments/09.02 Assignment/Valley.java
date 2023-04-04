public class Valley extends Terrain {
    private double depth;

    public Valley (int l, int w, double d) {
        super(l, w);

        depth  = d;
    }

    public double getDepth () {
        return depth;
    }
}
