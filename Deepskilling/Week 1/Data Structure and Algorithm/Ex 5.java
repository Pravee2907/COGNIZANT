interface Notifier {
    void message();
}

class Email implements Notifier {

    public void message() {
        System.out.println("Email Notification Sent");
    }
}

abstract class Notify implements Notifier {

    Notifier n;

    Notify(Notifier n) {
        this.n = n;
    }
}

class SMS extends Notify {

    SMS(Notifier n) {
        super(n);
    }

    public void message() {
        n.message();
        System.out.println("SMS Notification Sent");
    }
}

class Slack extends Notify {

    Slack(Notifier n) {
        super(n);
    }

    public void message() {
        n.message();
        System.out.println("Slack Notification Sent");
    }
}

public class Ex5 {

    public static void main(String[] args) {

        Notifier a = new Email();
        a.message();

        System.out.println();

        Notifier b = new SMS(new Email());
        b.message();

        System.out.println();

        Notifier c = new Slack(new SMS(new Email()));
        c.message();
    }
}