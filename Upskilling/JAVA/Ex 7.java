<<<<<<< HEAD
=======

>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
class TypeCasting {
    public static void main(String[] args) {

        double decimalValue = 45.78;
        int intValue = (int) decimalValue;

        int number = 25;
        double doubleValue = (double) number;

        System.out.println("Original double value: " + decimalValue);
        System.out.println("After casting to int: " + intValue);

        System.out.println("Original int value: " + number);
        System.out.println("After casting to double: " + doubleValue);
    }
}