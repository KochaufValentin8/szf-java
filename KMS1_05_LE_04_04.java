import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KMS01_05_LE_04_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userinput = 0;
        boolean isvalidInput = false;

        // userinput schleife
        while (!isvalidInput) {
            try {
                System.out.println("Bitte geben Sie die Anzahl der Lottoziehungen ein:");
                userinput = scanner.nextInt();
                isvalidInput = true;
            } catch (Exception e) {
                System.out.println("Fehler! Bitte geben Sie eine Ganzzahl ein.");
                scanner.next();
            }
        }

        int[] numbers = new int[45];
        Random random = new Random();

        // Lottoziehungen simulieren und Zahlen zählen
        for (int i = 0; i < userinput; i++) {
            List<Integer> draw = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int num = random.nextInt(45) + 1; //zufallszahl zwischen 1 - 45
                draw.add(num);
                numbers[num - 1]++;
            }
        }

        // Ausgabe der Prozent der Zahlen
        System.out.println("Warscheinlichkeit der Lottozahlen:");
        for (int i = 0; i < numbers.length; i++) {
            double percentage = (double) numbers[i] / (double) (userinput * 6) * 100.0; // 6 weil 6 zahlen pro ziehung


            // kürzen
            String formattedPercentage = String.format("%.2f", percentage);
            System.out.println((i + 1) + ": " + formattedPercentage + "%");
        }

        scanner.close();
    }
}
