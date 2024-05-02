import java.util.Scanner;
import java.util.regex.*;

public class KMS1_05_LE_05_02 {

    public static void main(String[] args) {
        // userinput
        Scanner scanner = new Scanner(System.in);
        boolean validip = false;

        while (!validip) {
            System.out.print("Geben Sie die IPV4-Adresse ein: ");
            String ipAddress = scanner.nextLine();

            // IP-Adressen Regex von Stackoverflow
            String ipRegex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";


            Pattern pattern = Pattern.compile(ipRegex);

            // regex überprüfung
            Matcher matcher = pattern.matcher(ipAddress);
            if (matcher.matches()) {
                validip = true;
                // ip aufteilen
                String[] ip_parts = ipAddress.split("\\.");

                // Konvertieren
                int[] dezimal = new int[4];
                String[] benaer = new String[4];
                String[] octal = new String[4];
                String[] hexadezimal = new String[4];

                for (int i = 0; i < 4; i++) {
                    dezimal[i] = Integer.parseInt(ip_parts[i]);
                    benaer[i] = Integer.toBinaryString(dezimal[i]);
                    octal[i] = Integer.toOctalString(dezimal[i]);
                    hexadezimal[i] = Integer.toHexString(dezimal[i]).toUpperCase();
                }

                // Ausgabe
                System.out.println("Dezimal: " + String.join(".", Integer.toString(dezimal[0]), Integer.toString(dezimal[1]), Integer.toString(dezimal[2]), Integer.toString(dezimal[3])));
                System.out.println("Binär: " + String.join(".", benaer));
                System.out.println("Oktal: " + String.join(".", octal));
                System.out.println("Hexadezimal: " + String.join(".", hexadezimal));
            } else {
                System.out.println("Bitte geben Sie eine gültige IP-Adresse ein.");
            }
        }
        scanner.close();
    }
}
