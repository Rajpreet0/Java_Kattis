import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int A = scanner.nextInt(); // Number of articles
        int I = scanner.nextInt(); // Required impact factor

        // Calculate the minimal number of scientists to bribe
        int totalCitations = A * I;
        int neededCitations = totalCitations - A;

        // Output the result
        System.out.println(neededCitations+1);

        // Close the scanner
        scanner.close();
    }
}
