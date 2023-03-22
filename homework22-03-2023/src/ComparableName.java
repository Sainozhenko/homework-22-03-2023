import java.util.Comparator;

public class ComparableName implements Comparator<Employee> {
    public int compare(Employee a1, Employee a2) {
        return a1.getName().compareTo(a2.getName());
    }
}