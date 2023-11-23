import java.util.Scanner;

public class undead_or_alive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean hasSmiley = input.contains(":)");
        boolean hasFrowny = input.contains(":(");

        if (hasSmiley && !hasFrowny) {
            System.out.println("alive");
        } else if (!hasSmiley && hasFrowny) {
            System.out.println("undead");
        } else if (hasSmiley && hasFrowny) {
            System.out.println("double agent");
        } else {
            System.out.println("machine");
        }

    }
}
