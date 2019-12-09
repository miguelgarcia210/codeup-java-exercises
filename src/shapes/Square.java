package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side,side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }
//    TODO: COMMENTED OUT FROM 'INTERFACES & ABSTRACT CLASSES EXERCISES'
//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        System.out.println("using");
//        return side * side;
//    }
//
//    public double getPerimeter() {
//        System.out.println("using");
//        return side * 4;
//    }
}
