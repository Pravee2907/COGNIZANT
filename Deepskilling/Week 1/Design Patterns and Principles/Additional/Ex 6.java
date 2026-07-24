class Book {

    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class Ex6 {

    static void linear(Book b[], String key) {

        boolean ok = false;

        for (int i = 0; i < b.length; i++) {

            if (b[i].title.equalsIgnoreCase(key)) {
                System.out.println("Book Found");
                System.out.println(b[i].id + " " + b[i].title + " " + b[i].author);
                ok = true;
                break;
            }
        }

        if (!ok) {
            System.out.println("Book Not Found");
        }
    }

    static void binary(Book b[], String key) {

        int first = 0;
        int last = b.length - 1;

        while (first <= last) {

            int mid = (first + last) / 2;

            int x = b[mid].title.compareToIgnoreCase(key);

            if (x == 0) {
                System.out.println("Book Found");
                System.out.println(b[mid].id + " " + b[mid].title + " " + b[mid].author);
                return;
            }

            if (x > 0) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        System.out.println("Book Not Found");
    }

    public static void main(String[] args) {

        Book b[] = {
                new Book(101, "C", "Dennis"),
                new Book(102, "Java", "James"),
                new Book(103, "Python", "Guido"),
                new Book(104, "SQL", "Oracle")
        };

        System.out.println("Linear Search");
        linear(b, "Python");

        System.out.println();

        System.out.println("Binary Search");
        binary(b, "Python");
    }
}