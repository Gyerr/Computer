public class Mountain extends Terrain {
    private int numberMountains;

    public Mountain (int l, int w, int n) {
        super(l, w);
        numberMountains = n;
    }

    public int getNumberMountains () {
        return numberMountains;
    }
}