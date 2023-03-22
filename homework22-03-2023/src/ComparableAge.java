import java.util.Comparator;

public class ComparableAge implements Comparator<Employee> {
    public int compare(Employee a1, Employee a2) {
        return Integer.compare(a1.getAge(), a2.getAge());
    }
}
