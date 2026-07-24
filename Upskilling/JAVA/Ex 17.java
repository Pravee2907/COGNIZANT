<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
>>>>>>> 84dfab70fbcbae39084d98be6e45b57addb2c091
class Car {

    String make;
    String model;
    int year;
    void displayDetails() {
        System.out.println("Car Make : " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year : " + year);
        System.out.println();
    }
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2022;

        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2021;

        car1.displayDetails();
        car2.displayDetails();
    }
}