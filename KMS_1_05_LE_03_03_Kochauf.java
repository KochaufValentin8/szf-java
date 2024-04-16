import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startpunkt = 0;
        int endpunkt = 0;
        int schrittweite = 0;

        try {
            System.out.print("Geben Sie ihre Startzahl ein: ");
            startpunkt = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Falsche Eingabe.");
            scanner.nextLine();

        }

        try {
            System.out.print("Geben Sie ihre Endzahl ein: ");
            endpunkt = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Fehler, Falsche Eingabe.");
            scanner.nextLine();
        }

        try {
            System.out.print("Geben Sie ihre Schrittweite ein: ");
            schrittweite = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Fehler bei der Eingabe der Schrittweite. Stellen Sie sicher, dass Sie eine gültige Zahl eingeben.");
            scanner.nextLine();
        } finally {
            scanner.close();
        }

        System.out.println("Die Liste von " + startpunkt + " bis " + endpunkt + " mit Schrittweite " + schrittweite + " ist:");
        for (int i = startpunkt; i <= endpunkt; i += schrittweite) {
            System.out.print(i + " ");
        }
    }
}
