<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
>>>>>>> 84dfab70fbcbae39084d98be6e45b57addb2c091
import java.util.Scanner;
class ArraySumAverage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            int sum = 0;

            System.out.println("Enter the elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }
            double average = (double) sum / n;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        }
    }
}