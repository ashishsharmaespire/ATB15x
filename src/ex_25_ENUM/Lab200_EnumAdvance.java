package ex_25_ENUM;

public class Lab200_EnumAdvance {

    public static void main(String[] args) {
        double earthGravity = Planet.EARTH.surfaceGravity();
        System.out.println("Earth gravity = " + earthGravity);
    }
}

enum Planet {

    MERCURY(3.33e23, 2.44e6),
    VENUS(4.87e24, 6.05e6),
    EARTH(5.97e24, 6.37e6);

    private final double mass;
    private final double radius;

    // universal gravitational constant
    private static final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}
