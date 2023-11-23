import java.util.Scanner;

public class apaxiaaaans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputName = scanner.nextLine();
        String compactName = compactName(inputName);

        System.out.println(compactName);
    }

    private static String compactName(String name) {
        StringBuilder compactedName = new StringBuilder();

        char currentChar = '\0';
        for (char c : name.toCharArray()) {
            if (c != currentChar) {
                compactedName.append(c);
                currentChar = c;
            }
        }

        return compactedName.toString();
    }
}
