import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class HttpDemo {
    public static void main(String[] args) {

        try {

            URL url = new URL("https://api.github.com");

            HttpURLConnection con =
                    (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            int status = con.getResponseCode();

            System.out.println("Status Code: " + status);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;

            System.out.println("\nResponse Body:");

            while ((inputLine = in.readLine()) != null) {

                System.out.println(inputLine);
            }

            in.close();

            con.disconnect();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}