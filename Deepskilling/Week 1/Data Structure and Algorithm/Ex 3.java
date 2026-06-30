class Computer {

    String cpu;
    int ram;
    int storage;

    private Computer(Builder b) {
        cpu = b.cpu;
        ram = b.ram;
        storage = b.storage;
    }

    void show() {
        System.out.println("CPU : " + cpu);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
        System.out.println();
    }

    static class Builder {

        String cpu;
        int ram;
        int storage;

        Builder setCpu(String c) {
            cpu = c;
            return this;
        }

        Builder setRam(int r) {
            ram = r;
            return this;
        }

        Builder setStorage(int s) {
            storage = s;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }
}

public class Ex3 {

    public static void main(String[] args) {

        Computer c1 = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam(8)
                .setStorage(512)
                .build();

        Computer c2 = new Computer.Builder()
                .setCpu("AMD Ryzen 7")
                .setRam(16)
                .setStorage(1024)
                .build();

        c1.show();
        c2.show();
    }
}