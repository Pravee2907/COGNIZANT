class Task {

    int id;
    String name;
    String status;
    Task next;

    Task(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
        next = null;
    }
}

public class Ex5 {

    static Task head = null;

    static void add(int id, String name, String status) {

        Task t = new Task(id, name, status);

        if (head == null) {
            head = t;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = t;
        }
    }

    static void show() {

        Task temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.status);
            temp = temp.next;
        }
    }

    static void search(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.id == id) {
                System.out.println("Task Found");
                System.out.println(temp.id + " " + temp.name + " " + temp.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    static void delete(int id) {

        if (head == null)
            return;

        if (head.id == id) {
            head = head.next;
            System.out.println("Task Deleted");
            return;
        }

        Task temp = head;

        while (temp.next != null) {

            if (temp.next.id == id) {
                temp.next = temp.next.next;
                System.out.println("Task Deleted");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    public static void main(String[] args) {

        add(1, "Coding", "Pending");
        add(2, "Testing", "Done");
        add(3, "Debug", "Pending");

        System.out.println("Task List");
        show();

        System.out.println();

        search(2);

        System.out.println();

        delete(1);

        System.out.println();

        System.out.println("After Delete");
        show();
    }
}