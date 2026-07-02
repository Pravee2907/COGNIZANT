import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileWriting {
    public static void main(String[] args) {

        try (
            Scanner sc = new Scanner(System.in);
            FileWriter writer = new FileWriter("output.txt")
        ) {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            writer.write(text);
            System.out.println("Data has been written to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}