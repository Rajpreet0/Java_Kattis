import java.util.Scanner;

public class Spritt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of classrooms and available bottles of sanitizer
        int numClassrooms = scanner.nextInt();
        int availableSanitizer = scanner.nextInt();

        // Read the number of bottles each classroom needs
        int[] classroomNeeds = new int[numClassrooms];
        for (int i = 0; i < numClassrooms; i++) {
            classroomNeeds[i] = scanner.nextInt();
        }

        scanner.close();

        // Check if there's enough sanitizer for all classrooms
        int totalNeeds = 0;
        for (int needs : classroomNeeds) {
            totalNeeds += needs;
        }

        if (totalNeeds <= availableSanitizer) {
            System.out.println("Jebb"); // There's enough sanitizer for all classrooms
        } else {
            System.out.println("Neibb"); // There's not enough sanitizer for all classrooms
        }
    }
}