import java.util.Locale;
import java.util.Scanner;


public class Heart_Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int cases = scanner.nextInt();

        // Arrays to store inputs
        int[] beatsArray = new int[cases];
        double[] timeArray = new double[cases];

        // Read all input cases
        for (int i = 0; i < cases; i++) {
            beatsArray[i] = scanner.nextInt();
            timeArray[i] = scanner.nextDouble();
        }

        // Output all results
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < cases; i++) {
            int beats = beatsArray[i];
            double time = timeArray[i];

            double minABPM = 60 / (time / (beats - 1));
            double bpm = 60 / (time / beats);
            double maxABPM = 60 / (time / (beats + 1));

            output.append(String.format("%.4f %.4f %.4f%n", minABPM, bpm, maxABPM));
        }

        // Print the output block
        System.out.print(output);

        scanner.close();
    }
}