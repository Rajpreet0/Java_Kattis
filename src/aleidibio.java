import java.util.Scanner;

public class aleidibio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = input(scanner, 1, 100);
        int b = input(scanner, 1, 100);
        int c = input(scanner, 720, 1439);

        int sum = a + b;
        System.out.println(c-sum);

    }

    public static int input(Scanner scanner, int y, int z){
        int x = 0;
        do {
            x = scanner.nextInt();
        }while (x < y || x > z);
        return x;
    }
}
