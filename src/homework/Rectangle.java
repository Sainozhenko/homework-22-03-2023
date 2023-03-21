package homework;

public class Rectangle extends Shape {
    double width;
    double height;
    String name;

    Rectangle(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nRectangle { " +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getArea() {
        return width * height;
    }
}
