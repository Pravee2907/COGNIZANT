<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
>>>>>>> 84dfab70fbcbae39084d98be6e45b57addb2c091
import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter marks out of 100: ");
            int marks = sc.nextInt();

            char grade;

            if (marks >= 90 && marks <= 100) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Assigned Grade: " + grade);
        }
    }
}