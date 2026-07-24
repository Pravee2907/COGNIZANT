<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
// Inheritance Example Program in Java

>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
>>>>>>> 84dfab70fbcbae39084d98be6e45b57addb2c091
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
class InheritanceExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}