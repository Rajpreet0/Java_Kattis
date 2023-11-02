import java.util.Scanner;

public class Hraðgreining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scan the String
        String dnaString= scanner.next();
        scanner.close();

        // Checks if a String of Dna contains a specific Substring
        if (dnaString.contains("COV")) {
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki veikur!");
        }
    }
}
