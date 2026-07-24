import java.util.ArrayList;

class Product {

    int id;
    String name;
    int qty;
    double price;

    Product(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    void print() {
        System.out.println(id + " " + name + " " + qty + " " + price);
    }
}

public class Ex1 {

    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product(1, "Laptop", 5, 50000));
        list.add(new Product(2, "Mouse", 20, 500));

        System.out.println("Products");

        for (Product p : list) {
            p.print();
        }

        for (Product p : list) {
            if (p.id == 2) {
                p.qty = 25;
            }
        }

        System.out.println("\nAfter Update");

        for (Product p : list) {
            p.print();
        }

        list.remove(0);

        System.out.println("\nAfter Delete");

        for (Product p : list) {
            p.print();
        }
    }
}