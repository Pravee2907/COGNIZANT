interface PaymentProcessor {
    void pay(int money);
}

class GooglePay {

    void sendMoney(int amt) {
        System.out.println("Payment done using Google Pay : " + amt);
    }
}

class PhonePe {

    void transfer(int amt) {
        System.out.println("Payment done using PhonePe : " + amt);
    }
}

class GooglePayAdapter implements PaymentProcessor {

    GooglePay g = new GooglePay();

    public void pay(int money) {
        g.sendMoney(money);
    }
}

class PhonePeAdapter implements PaymentProcessor {

    PhonePe p = new PhonePe();

    public void pay(int money) {
        p.transfer(money);
    }
}

public class Ex4 {

    public static void main(String[] args) {

        PaymentProcessor pay1 = new GooglePayAdapter();
        pay1.pay(500);

        PaymentProcessor pay2 = new PhonePeAdapter();
        pay2.pay(1000);
    }
}