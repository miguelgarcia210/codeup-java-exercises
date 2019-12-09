package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
        Rectangle myShape = new Rectangle(3,5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getLength());

        Square myShape2 = new Square(5);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getLength());
    }
}
