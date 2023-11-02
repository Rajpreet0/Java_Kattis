import java.util.Scanner;

public class Amerískur_vinnustaður {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            n = scanner.nextInt();
        } while (n < 1 || n > 100000);

        System.out.println(n*CONVERSION);

    }

    private static final double CONVERSION = 0.09144;
}
