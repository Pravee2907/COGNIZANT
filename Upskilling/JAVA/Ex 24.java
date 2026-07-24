import java.util.ArrayList;
import java.util.Scanner;

class StudentList {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            ArrayList<String> students = new ArrayList<>();

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter student name " + (i + 1) + ": ");
                String name = sc.nextLine();
                students.add(name);
            }

            System.out.println("\nStudent Names:");

            for (String student : students) {
                System.out.println(student);
            }
        }
    }
}