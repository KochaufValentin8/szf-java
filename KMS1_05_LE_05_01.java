import java.util.Scanner;

public class KMS1_05_LE_05_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;


        while (!validInput) {
            // userinput
            System.out.println("Geben Sie einen Farbcode im Format #RRGGBB:");
            String userInput = scanner.nextLine();

            // Regex für farbcode input
            String hexRegex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

            // userinput überprüfung mit regex
            if (!userInput.matches(hexRegex)) {
                System.out.println("Fehler! Bitte geben Sie einen Farbcode im Format #RRGGBB ein!");
            } else {
                validInput = true;

                // Farbcode in Rot Grün Blau aufteilen
                int bestandteilrot = Integer.parseInt(userInput.substring(1, 3), 16);
                int bestandteilgruen = Integer.parseInt(userInput.substring(3, 5), 16);
                int bestndteilblau = Integer.parseInt(userInput.substring(5, 7), 16);

                // Ergebnis ausgeben
                System.out.println("Rot: " + bestandteilrot);
                System.out.println("Grün: " + bestandteilgruen);
                System.out.println("Blau: " + bestndteilblau);
            }
        }
        
        scanner.close();
    }
}
