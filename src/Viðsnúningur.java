import java.util.Scanner;
public class Viðsnúningur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name = new StringBuilder(name).reverse().toString();
        System.out.print(name);
        scanner.close();
    }
}
