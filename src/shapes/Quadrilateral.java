package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) { // constructor for quadrilateral class
        this.length = length;
        this.width = width;
    }

    public double getLength() { // getters for protected properties
        return length;
    }

    public double getWidth() { // getters for protected properties
        return width;
    }

    public abstract void setLength(double length); // sets abstract method
    public abstract void setWidth(double width); // sets abstract method
}