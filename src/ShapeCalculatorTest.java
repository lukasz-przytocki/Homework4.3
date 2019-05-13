public class ShapeCalculatorTest {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Square square = new Square(5);
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2,3);
        Triangle triangle = new Triangle(1,2,3);

        System.out.println("Square area: " + shapeCalculator.squareArea(square));
        System.out.printf("Circle area: %.2f\n", shapeCalculator.circleArea(circle));
        System.out.println("Rectangle perimeter: " + shapeCalculator.rectPerimeter(rectangle));
        System.out.println("Triangle perimeter: " + shapeCalculator.trianglePerimeter(triangle));

    }

}
