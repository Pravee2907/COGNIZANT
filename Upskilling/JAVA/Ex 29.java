import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {
}

class RecordDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Ravi", 20);
        Person p2 = new Person("Anu", 17);
        Person p3 = new Person("Priya", 22);

        System.out.println("Person Details:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        List<Person> people = new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);

        List<Person> adults = people.stream().filter(p -> p.age() >= 18).collect(Collectors.toList());

        System.out.println("\nPeople with age 18 and above:");

        for (Person p : adults) {
            System.out.println(p);
        }
    }
}