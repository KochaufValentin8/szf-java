import java.util.Scanner;

public class KMS1_05_LE_04_02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe des Textes und des Schlüssels
        System.out.println("Bitte geben Sie einen Text ein:");
        String userInput = scanner.nextLine().toLowerCase(); // Alles zu Kleinbuchstaben umwandeln

        int key = 0;
        boolean validKey = false;

        // Überprüfung des Schlüssels
        while (!validKey) {
            try {
                System.out.println("Bitte geben Sie den Key für die Verschlüsselung ein (1 - 25):");
                key = Integer.parseInt(scanner.nextLine());
                if (key >= 1 && key <= 25) {
                    validKey = true;
                } else {
                    System.out.println("Ungültiger Key. Bitte geben Sie einen Key zwischen 1 und 25 ein.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
            }
        }

        // Verschlüsselung des Textes
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < userInput.length(); i++) {
            char character = userInput.charAt(i);
            if (Character.isLetter(character)) {
                // Buchstaben behandeln
                encryptedText.append((char) ((character - 'a' + key) % 26 + 'a'));
            } else {
                // Sonderzeichen
                encryptedText.append(character);
            }
        }

        System.out.println("Verschlüsselter Text: " + encryptedText.toString());

        scanner.close();
    }
}
