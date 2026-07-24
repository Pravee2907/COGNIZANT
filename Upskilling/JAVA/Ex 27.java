import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LambdaDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anu");
        names.add("Karthik");
        names.add("Priya");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}