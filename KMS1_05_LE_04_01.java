import java.util.Scanner;

public class KMS1_05_LE_04_01 {
    public static void main(String[] args) {
        // Benutzereingabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Text ein:");
        String text = "";
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Fehler! Versuchen Sie es erneut." + e.getMessage());
            return;
        }


        char[] vokale = {'a', 'e', 'i', 'o', 'u'};
        char[] konsonanten = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        char[] satzzeichen = {'.', ',', ';', ':', '!', '?', '-', '"', '(', ')', '[', ']', '{', '}'};
        int num_vokale = 0;
        int num_konsonanten = 0;
        int num_satzzeichen = 0;
        int num_leerzeichen = 0;

        // Überprüfung ob Vokal
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                for (char vokal : vokale) {
                    if (c == vokal) {
                        num_vokale++;
                        break;
                    }
                }
                // Überprüfung ob Konsonant
                for (char konsonant : konsonanten) {
                    if (c == konsonant) {
                        num_konsonanten++;
                        break;
                    }
                }
                // Überprüfung ob Leerzeichen
            } else if (Character.isWhitespace(c)) {
                num_leerzeichen++;
            } else {
                // Überprüfung ob Satzzeichen
                for (char zeichen : satzzeichen) {
                    if (c == zeichen) {
                        num_satzzeichen++;
                        break;
                    }
                }
            }
        }

        // Ergebnisse
        System.out.println("Anzahl der Vokale: " + num_vokale);
        System.out.println("Anzahl der Konsonanten: " + num_konsonanten);
        System.out.println("Anzahl der Satzzeichen: " + num_satzzeichen);
        System.out.println("Anzahl der Leerzeichen: " + num_leerzeichen);
        System.out.println("Länge des Textes: " + text.length());


        scanner.close();
    }
}
