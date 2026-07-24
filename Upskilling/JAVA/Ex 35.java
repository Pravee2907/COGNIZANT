import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class Client {
    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String message;

            while (true) {

                System.out.print("Client: ");
                message = keyboard.readLine();

                out.println(message);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                String reply = in.readLine();

                System.out.println("Server: " + reply);
            }

            socket.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}