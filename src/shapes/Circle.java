package shapes;

public class Circle {
    private double radius;
    private static int counter;

    public Circle(double radius) {
        this.radius = radius;
        Circle.counter++;
    }

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference() {
        return (2 * Math.PI) * radius;
    }

    public static int getCounter() {
        return counter;
    }
}
