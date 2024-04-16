import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Jahreszahl ein:");

        int first_input_year = 0;
        int second_input_year = 0;

        while (true) {
            try {
                first_input_year = scanner.nextInt();

                // Überprüfung der 1. Eingabe
                if (first_input_year > 999 && first_input_year < 10000) {
                    break;
                } else {
                    System.out.println("Bitte geben Sie eine gültige Jahreszahl im Format YYYY ein!");
                }
            } catch (Exception e) {
                System.out.println("Bitte geben Sie eine gültige Jahreszahl im Format YYYY, z.B. 2013, ein!");
                scanner.next();
            }
        }

        System.out.println("Geben Sie die zweite Jahreszahl ein:");

        while (true) {
            try {
                second_input_year = scanner.nextInt();

                // Überprüfung der 2. Eingabe
                if (second_input_year > 999 && second_input_year < 10000 && second_input_year > first_input_year) {
                    break;
                } else {
                    System.out.println("Bitte geben Sie eine gültige Jahreszahl im Format YYYY ein, die größer ist als die erste eingegebene Jahreszahl!");
                }
            } catch (Exception e) {
                System.out.println("Bitte geben Sie eine gültige Jahreszahl im Format YYYY, z.B. 2013, ein!");
                scanner.next();
            }
        }

        // Überprüfung und Ausgabe von Schaltjahren
        System.out.println("Schaltjahre zwischen " + first_input_year + " und " + second_input_year + ":");
        for (int counter_year = first_input_year; counter_year <= second_input_year; counter_year++) {
            if ((counter_year % 4 == 0 && counter_year % 100 != 0) || counter_year % 400 == 0) {
                System.out.println(counter_year + " ist ein Schaltjahr");
            }
        }
    }
}
