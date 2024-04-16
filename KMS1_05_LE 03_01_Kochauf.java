import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bezeichnung;
        int stueckzahl;
        String einzelpreis;


        //Bezeichnung
        String regex_bezeichung = "^[a-zA-ZäöüÄÖÜ]{2,}$"; // muss mindestens 2 zeichen haben
        Pattern pattern = Pattern.compile(regex_bezeichung);

        while (true) {
            System.out.println("Bitte geben Sie die Bezeichnung ein:");
            bezeichnung = scanner.next();
            Matcher matcher = pattern.matcher(bezeichnung);
            if (matcher.matches()) {
                break;
            }
            else {
            System.out.println("Falsche Eingabe! Bitte den Bezeichner eingeben.");
            }

        }



      // Stückzahl
        while (true) {
            System.out.println("Bitte geben Sie die Stückzahl ein:");
            String input = scanner.next();
            try {
                stueckzahl = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Falsche Eingabe! Bitte geben Sie eine Ganzzahl ein.");
            }
        }

        //Einzelstückpreis

        String regex_preis = "\\d+,\\d+"; //zahlen , zahlen
        Pattern patternpreis = Pattern.compile(regex_preis);

        while (true) {
            System.out.println("Bitte geben Sie den Einzelstückpreis ein:");
            einzelpreis = scanner.next();
            Matcher matcherpreis = patternpreis.matcher(einzelpreis);
            if (matcherpreis.matches()) {
                break;
            }
            else {
            System.out.println("Falsche Eingabe! Bitte mit Komma eingeben.");
            }

        }



        // Ausgabe des zusammengesetzten Datensatzes
        System.out.println("\nZusammengesetzter Datensatz:");
        System.out.println("Bezeichnung: " + bezeichnung);
        System.out.println("Stückzahl: " + stueckzahl);
        System.out.println("Einzelpreis: " + einzelpreis);
    }
}
