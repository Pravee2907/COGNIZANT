import java.util.ArrayList;

interface Stock {
    void add(Observer o);
    void remove(Observer o);
    void send();
}

interface Observer {
    void show(String msg);
}

class StockMarket implements Stock {

    ArrayList<Observer> list = new ArrayList<>();
    String price;

    public void add(Observer o) {
        list.add(o);
    }

    public void remove(Observer o) {
        list.remove(o);
    }

    public void changePrice(String p) {
        price = p;
        send();
    }

    public void send() {
        for (Observer o : list) {
            o.show(price);
        }
    }
}

class MobileApp implements Observer {

    public void show(String msg) {
        System.out.println("Mobile App : " + msg);
    }
}

class WebApp implements Observer {

    public void show(String msg) {
        System.out.println("Web App : " + msg);
    }
}

public class Ex7 {

    public static void main(String[] args) {

        StockMarket s = new StockMarket();

        Observer m = new MobileApp();
        Observer w = new WebApp();

        s.add(m);
        s.add(w);

        s.changePrice("TCS = Rs.4200");
    }
}