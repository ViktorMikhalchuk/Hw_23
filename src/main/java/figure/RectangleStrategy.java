package figure;

public class RectangleStrategy implements ShapeStrategy {
    private double length;
    private double width;

    public RectangleStrategy(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

