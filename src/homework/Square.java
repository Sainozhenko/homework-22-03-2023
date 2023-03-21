package homework;

public class Square extends Shape {
    double side;
    String name;

    public Square(int side, String name) {
        this.side = side;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\t\nSquare { " +
                "side=" + side +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
