class Employee {

    int id;
    String name;
    String job;
    double salary;

    Employee(int id, String name, String job, double salary) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
}

public class Ex4 {

    static Employee emp[] = new Employee[10];
    static int count = 0;

    static void add(Employee e) {
        emp[count] = e;
        count++;
    }

    static void show() {

        for (int i = 0; i < count; i++) {
            System.out.println(emp[i].id + " " + emp[i].name + " " + emp[i].job + " " + emp[i].salary);
        }
    }

    static void search(int id) {

        for (int i = 0; i < count; i++) {

            if (emp[i].id == id) {
                System.out.println("Employee Found");
                System.out.println(emp[i].id + " " + emp[i].name + " " + emp[i].job + " " + emp[i].salary);
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    static void delete(int id) {

        for (int i = 0; i < count; i++) {

            if (emp[i].id == id) {

                for (int j = i; j < count - 1; j++) {
                    emp[j] = emp[j + 1];
                }

                count--;
                System.out.println("Employee Deleted");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    public static void main(String[] args) {

        add(new Employee(101, "Ravi", "Manager", 50000));
        add(new Employee(102, "Priya", "Developer", 40000));
        add(new Employee(103, "Kumar", "Tester", 35000));

        System.out.println("Employee List");
        show();

        System.out.println();

        search(102);

        System.out.println();

        delete(101);

        System.out.println();

        System.out.println("After Delete");
        show();
    }
}