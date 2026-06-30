interface CustomerRepository {

    String getCustomer(int id);
}

class CustomerRepositoryImpl implements CustomerRepository {

    public String getCustomer(int id) {
        return "Customer Id : " + id + " Name : Praveena";
    }
}

class CustomerService {

    CustomerRepository r;

    CustomerService(CustomerRepository r) {
        this.r = r;
    }

    void showCustomer(int id) {
        System.out.println(r.getCustomer(id));
    }
}

public class Ex11 {

    public static void main(String[] args) {

        CustomerRepository r = new CustomerRepositoryImpl();

        CustomerService s = new CustomerService(r);

        s.showCustomer(101);
    }
}