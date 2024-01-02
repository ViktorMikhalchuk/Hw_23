package figure;

public class ShapeContext {
    private ShapeStrategy strategy;

    public ShapeContext(ShapeStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea() {
        return strategy.calculateArea();
    }
}
