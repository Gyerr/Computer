public class GameTerrainTester {
    public static void main (String[] args) {
        Terrain t1 = new Terrain(500, 500);
        Forest f1 = new Forest(640, 500, 2534);
        Mountain m1 = new Mountain(1920, 1080, 1500);
        WinterMountain wm1 = new WinterMountain(900, 900, 553, 11.45);
        Valley v1 = new Valley(500, 900, 3748.47);
        RiverValley rv1 = new RiverValley(800, 1700, 2565.48, 300.5);

        System.out.println(t1.getTerrainSize());
        System.out.println("Forest " + f1.getTerrainSize() + " and has " + f1.getTrees() + " trees.");
        System.out.println("Mountain " + m1.getTerrainSize() + " and has " + m1.getNumberMountains() + " mountains.");
        System.out.println("Winter Mountain " + wm1.getTerrainSize() + " and has " + wm1.getNumberMountains() + " mountains and temperature " + wm1.getTemperature() + " degrees.");
        System.out.println("Valley " + v1.getTerrainSize() + " and has " + v1.getDepth() + " feet depth.");
        System.out.println("River Valley " + rv1.getTerrainSize() + " and has " + rv1.getDepth() + " feet depth and " + rv1.getLength() + " miles river length.");
    }
}
