interface PaymentStrategy {
    void payAmount(int amt);
}

class CreditCard implements PaymentStrategy {

    public void payAmount(int amt) {
        System.out.println("Paid by Credit Card : Rs." + amt);
    }
}

class PayPal implements PaymentStrategy {

    public void payAmount(int amt) {
        System.out.println("Paid by PayPal : Rs." + amt);
    }
}

class Payment {

    PaymentStrategy p;

    Payment(PaymentStrategy p) {
        this.p = p;
    }

    void makePayment(int amt) {
        p.payAmount(amt);
    }
}

public class Ex8 {

    public static void main(String[] args) {

        Payment p1 = new Payment(new CreditCard());
        p1.makePayment(1500);

        Payment p2 = new Payment(new PayPal());
        p2.makePayment(2500);
    }
}