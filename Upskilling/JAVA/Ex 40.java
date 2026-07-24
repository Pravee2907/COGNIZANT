<<<<<<< HEAD
=======

>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
class VirtualThreads {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Running in virtual thread"));
        }
    }
}