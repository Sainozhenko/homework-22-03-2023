import java.util.Comparator;

public class ComparableSalary implements Comparator<Employee> {
    public int compare(Employee a1, Employee a2) {
        return Integer.compare(a1.getSalary(), a2.getSalary());
    }
}
