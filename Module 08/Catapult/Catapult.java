package Catapult;

public class Catapult {
    private int Speed, Angle;
    private double Distance;
    private final double EARTH_GRAVITY = 9.8;

    public Catapult () {
    }
    public double getDistance() {
        return Distance;
    }
    public int getSpeed() {
        return Speed;
    }
    public int getAngle() {
        return Angle;
    }

    public double calcDistance (int speed, int angle) {
        Distance = ((double)(speed * speed) * Math.sin(2.0 * Math.toRadians((double)angle)) / EARTH_GRAVITY); 
        return Distance;
    }
}
