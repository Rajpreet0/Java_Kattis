import java.util.Scanner;

public class flatbokuveisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = input(scanner);
        int m = input(scanner);

        int res = n % m;

        System.out.println(res);

    }

    public static int input(Scanner scanner){
        int x = 0;
        do {
            x = scanner.nextInt();
        }while (x < 1 || x > 1000000);
        return x;
    }
}
