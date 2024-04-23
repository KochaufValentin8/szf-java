import java.util.InputMismatchException;
import java.util.Scanner;

public class KMS1_05_LE_04_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Testpersonen userinput
            System.out.print("Geben Sie die Anzahl der Testpersonen ein: ");
            int num_testpersonen = scanner.nextInt();

            int[] bewertungen = new int[num_testpersonen];

            // generate Bewertungen
            for (int i = 0; i < num_testpersonen; i++) {
                bewertungen[i] = (int) (Math.random() * 3) + 1; // Zufällige Bewertung zwischen 1 und 3
            }

            // bewertungen
            double bewertung_bad = 0, bewertung_mid = 0, bewertung_top = 0;
            for (int bewertung : bewertungen) {
                switch (bewertung) {
                    case 1:
                        bewertung_bad++;
                        break;
                    case 2:
                        bewertung_mid++;
                        break;
                    case 3:
                        bewertung_top++;
                        break;
                    default:
                        System.out.println("Ungültige Bewertung!");
                        break;
                }
            }

            // Prozentuale Bewertung
            double prozentNichtEmpfehlenswert = bewertung_bad / num_testpersonen * 100;
            double prozentAkzeptabel = bewertung_mid / num_testpersonen * 100;
            double prozentHervorragend = bewertung_top / num_testpersonen * 100;

            double gesamtbewertung = (bewertung_bad * 1 + bewertung_mid * 2 + bewertung_top * 3) / (double) num_testpersonen;

            // Ausgabe der Ergebnisse
            System.out.println("Anzahl der Testpersonen: " + num_testpersonen);
            System.out.println("Anzahl nicht empfehlenswert: " + (int) bewertung_bad);
            System.out.println("Anzahl akzeptabel: " + (int) bewertung_mid);
            System.out.println("Anzahl hervorragend: " + (int) bewertung_top);

            System.out.printf("Gesamtbewertung für das neue Produkt: %.2f\n", gesamtbewertung);

            System.out.printf("Prozentuale Bewertung nicht empfehlenswert: %.2f%%\n", prozentNichtEmpfehlenswert);
            System.out.printf("Prozentuale Bewertung akzeptabel: %.2f%%\n", prozentAkzeptabel);
            System.out.printf("Prozentuale Bewertung hervorragend: %.2f%%\n", prozentHervorragend);
        } catch (InputMismatchException e) {
            System.out.println("Fehler beim Einlesen der Eingabe. Stellen Sie sicher, dass Sie eine ganze Zahl eingeben.");
        } finally {
            scanner.close();
        }
    }
}
