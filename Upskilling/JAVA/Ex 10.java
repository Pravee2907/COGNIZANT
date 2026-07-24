<<<<<<< HEAD
//  Number Guessing Game
=======
>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;

        try (Scanner sc = new Scanner(System.in)) {

            int guess;

            System.out.println("Guess a number between 1 and 100");

            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                if (guess > randomNumber) {
                    System.out.println("Too High!");
                } else if (guess < randomNumber) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                }

            } while (guess != randomNumber);
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 2b65e1a2b5e712391b5153c01bf3f11523a64100
