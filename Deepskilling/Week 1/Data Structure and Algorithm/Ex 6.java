interface Image {
    void show();
}

class RealImage implements Image {

    String name;

    RealImage(String n) {
        name = n;
        load();
    }

    void load() {
        System.out.println("Loading Image : " + name);
    }

    public void show() {
        System.out.println("Showing Image : " + name);
    }
}

class ProxyImage implements Image {

    String name;
    RealImage img;

    ProxyImage(String n) {
        name = n;
    }

    public void show() {

        if (img == null) {
            img = new RealImage(name);
        }

        img.show();
    }
}

public class Ex6 {

    public static void main(String[] args) {

        Image pic = new ProxyImage("Nature.jpg");

        pic.show();

        System.out.println();

        pic.show();
    }
}