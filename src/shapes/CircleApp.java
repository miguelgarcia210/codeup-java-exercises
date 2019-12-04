package shapes;

import util.Input;

public class CircleApp {
    private static Input input = new Input();

    private static int circleCount;

    public static void createCircle() {
        Circle circle = new Circle(input.getDouble());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        circleCount++;
        if (input.yesNo("Would you like to create another circle?")) {
            createCircle();
        } else {
            System.out.printf("Total circles created: %d", circleCount);
        }
    }

    public static void main(String[] args) {
        createCircle();
    }
}
