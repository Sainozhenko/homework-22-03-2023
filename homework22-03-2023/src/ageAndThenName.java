import java.util.Comparator;

public class ageAndThenName implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
//        if(a.getAge()== b.getAge())return 0;
//        else(a.getName()- b.getName())return 1;

        int resAge = Integer.compare(a.getAge(), b.getAge());
        if (resAge == 0) {
            resAge = a.getName().compareTo(b.getName());
        }
        return resAge;
    }
}
