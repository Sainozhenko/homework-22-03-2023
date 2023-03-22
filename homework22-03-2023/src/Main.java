import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> persons = new ArrayList<>();
        persons.add(new Employee(1, "Adam", 1500, 23));
        persons.add(new Employee(5, "Brock", 3211, 23));
        persons.add(new Employee(4, "Carl", 1111, 23));
        persons.add(new Employee(3, "Lili", 2134, 23));
        persons.add(new Employee(88, "Albert", 3900, 23));

        for (Employee person : persons) {
            System.out.println(person);
        }

        System.out.println();
        Collections.sort(persons);

        for (Employee person : persons) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Sorting by age: ");
        Collections.sort(persons, new ComparableAge());
        for (Employee person : persons) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Sorting by Name: ");
        Collections.sort(persons, new ComparableName());
        for (Employee person : persons) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Sorting by salary: ");
        Collections.sort(persons, new ComparableSalary());
        for (Employee person : persons) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Sorting by Name if age is exactly: ");
        Collections.sort(persons, new ageAndThenName());
        for (Employee person : persons) {
            System.out.println(person);
        }
        /*Employee{id=1, name='Adam', salary=1500, age=23}
Employee{id=5, name='Brock', salary=3211, age=23}
Employee{id=4, name='Carl', salary=1111, age=23}
Employee{id=3, name='Lili', salary=2134, age=23}
Employee{id=88, name='Albert', salary=3900, age=23}

Employee{id=1, name='Adam', salary=1500, age=23}
Employee{id=3, name='Lili', salary=2134, age=23}
Employee{id=4, name='Carl', salary=1111, age=23}
Employee{id=5, name='Brock', salary=3211, age=23}
Employee{id=88, name='Albert', salary=3900, age=23}

Sorting by age:
Employee{id=1, name='Adam', salary=1500, age=23}
Employee{id=3, name='Lili', salary=2134, age=23}
Employee{id=4, name='Carl', salary=1111, age=23}
Employee{id=5, name='Brock', salary=3211, age=23}
Employee{id=88, name='Albert', salary=3900, age=23}

Sorting by Name:
Employee{id=1, name='Adam', salary=1500, age=23}
Employee{id=88, name='Albert', salary=3900, age=23}
Employee{id=5, name='Brock', salary=3211, age=23}
Employee{id=4, name='Carl', salary=1111, age=23}
Employee{id=3, name='Lili', salary=2134, age=23}

Sorting by salary:
Employee{id=4, name='Carl', salary=1111, age=23}
Employee{id=1, name='Adam', salary=1500, age=23}
Employee{id=3, name='Lili', salary=2134, age=23}
Employee{id=5, name='Brock', salary=3211, age=23}
Employee{id=88, name='Albert', salary=3900, age=23}

Sorting by Name if salary exactly:
Employee{id=1, name='Adam', salary=1500, age=23}
Employee{id=88, name='Albert', salary=3900, age=23}
Employee{id=5, name='Brock', salary=3211, age=23}
Employee{id=4, name='Carl', salary=1111, age=23}
Employee{id=3, name='Lili', salary=2134, age=23}*/

    }
}