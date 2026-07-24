class Product {

    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
}

public class Ex2 {

    static void linear(Product p[], int key) {

        boolean found = false;

        for (int i = 0; i < p.length; i++) {
            if (p[i].id == key) {
                System.out.println("Product Found : " + p[i].name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }
    }

    static void binary(Product p[], int key) {

        int first = 0;
        int last = p.length - 1;

        while (first <= last) {

            int mid = (first + last) / 2;

            if (p[mid].id == key) {
                System.out.println("Product Found : " + p[mid].name);
                return;
            }

            if (key < p[mid].id) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        System.out.println("Product Not Found");
    }

    public static void main(String[] args) {

        Product p[] = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search");
        linear(p, 103);

        System.out.println();

        System.out.println("Binary Search");
        binary(p, 103);
    }
}