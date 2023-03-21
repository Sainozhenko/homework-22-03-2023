package homework;

public class Circle extends Shape {
    int radius;
    String name;

    Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nCircle { " +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

}
