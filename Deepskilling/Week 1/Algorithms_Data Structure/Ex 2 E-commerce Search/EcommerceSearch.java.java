class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Category     : " + category);
    }
}

public class EcommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int key) {
        for (Product product : products) {
            if (product.productId == key) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int key) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (products[mid].productId == key) {
                return products[mid];
            } else if (products[mid].productId < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Sorted array for Binary Search
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Bag", "Travel")
        };

        int searchId = 104;

        System.out.println("===== Linear Search =====");
        Product result1 = linearSearch(products, searchId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println();

        System.out.println("===== Binary Search =====");
        Product result2 = binarySearch(products, searchId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}