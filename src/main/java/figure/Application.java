package figure;

public class Application {
    public static void main(String[] args) {
        ShapeStrategy rectangleStrategy = new RectangleStrategy(5, 10);
        ShapeContext rectangleContext = new ShapeContext(rectangleStrategy);
        System.out.println("Rectangle Area: " + rectangleContext.calculateArea());

        ShapeStrategy triangleStrategy = new TriangleStrategy(8, 6);
        ShapeContext triangleContext = new ShapeContext(triangleStrategy);
        System.out.println("Triangle Area: " + triangleContext.calculateArea());
    }
}
