class Order {

    int id;
    String name;
    double price;

    Order(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Ex3 {

    static void show(Order o[]) {

        for (Order x : o) {
            System.out.println(x.id + " " + x.name + " " + x.price);
        }
    }

    static void bubble(Order o[]) {

        for (int i = 0; i < o.length - 1; i++) {

            for (int j = 0; j < o.length - i - 1; j++) {

                if (o[j].price > o[j + 1].price) {

                    Order temp = o[j];
                    o[j] = o[j + 1];
                    o[j + 1] = temp;
                }
            }
        }
    }

    static void quick(Order o[], int low, int high) {

        if (low < high) {

            int p = split(o, low, high);

            quick(o, low, p - 1);
            quick(o, p + 1, high);
        }
    }

    static int split(Order o[], int low, int high) {

        double pivot = o[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (o[j].price < pivot) {

                i++;

                Order temp = o[i];
                o[i] = o[j];
                o[j] = temp;
            }
        }

        Order temp = o[i + 1];
        o[i + 1] = o[high];
        o[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Order a[] = {
                new Order(1, "Ravi", 2500),
                new Order(2, "Priya", 1200),
                new Order(3, "Kumar", 4500),
                new Order(4, "Anu", 1800)
        };

        Order b[] = {
                new Order(1, "Ravi", 2500),
                new Order(2, "Priya", 1200),
                new Order(3, "Kumar", 4500),
                new Order(4, "Anu", 1800)
        };

        System.out.println("Bubble Sort");
        bubble(a);
        show(a);

        System.out.println();

        System.out.println("Quick Sort");
        quick(b, 0, b.length - 1);
        show(b);
    }
}