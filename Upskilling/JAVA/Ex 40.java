<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
>>>>>>> 84dfab70fbcbae39084d98be6e45b57addb2c091
class VirtualThreads {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Running in virtual thread"));
        }
    }
}