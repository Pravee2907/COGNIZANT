class BytecodeDemo {

    void show() {

        int a = 10;
        int b = 20;

        int c = a + b;

        System.out.println("Sum = " + c);
    }

    public static void main(String[] args) {

        BytecodeDemo obj = new BytecodeDemo();

        obj.show();
    }
}