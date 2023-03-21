package homework;

public class Shape implements Comparable<Shape> {
    String name;

    double getArea() {
        return 0;
    }

    protected String getName() {
        return name;
    }

    @Override
    public int compareTo(Shape o) {
        if (getArea() < o.getArea()) {
            return (int) (getArea() - o.getArea());
        }
        return 0;
    }
}
