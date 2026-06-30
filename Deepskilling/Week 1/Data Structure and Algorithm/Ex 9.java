interface Command {
    void run();
}

class Light {

    void on() {
        System.out.println("Light is ON");
    }

    void off() {
        System.out.println("Light is OFF");
    }
}

class LightOn implements Command {

    Light l;

    LightOn(Light l) {
        this.l = l;
    }

    public void run() {
        l.on();
    }
}

class LightOff implements Command {

    Light l;

    LightOff(Light l) {
        this.l = l;
    }

    public void run() {
        l.off();
    }
}

class Remote {

    Command c;

    void set(Command c) {
        this.c = c;
    }

    void press() {
        c.run();
    }
}

public class Ex9 {

    public static void main(String[] args) {

        Light l = new Light();

        Remote r = new Remote();

        r.set(new LightOn(l));
        r.press();

        r.set(new LightOff(l));
        r.press();
    }
}