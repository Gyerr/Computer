
public class Forest extends Terrain {
    private int numberTrees;

    public Forest (int l, int w, int number) {
        super(l, w);
        numberTrees = number;

    }

    public int getTrees () {
        return numberTrees;
    }
}
