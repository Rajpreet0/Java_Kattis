import java.util.Scanner;

// Easy 1.3 - Tarifa
public class trivia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = input(scanner, 1, 100);
        int n = input(scanner, 1, 100);

        int sum = 0;
        for (int i = 0; i < n; i++){
            int p = input(scanner, 0, 10000);
            sum = sum + p;
        }

        System.out.println(((x*n)-sum)+x);

    }

    public static int input(Scanner scanner, int a, int b){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < a || x > b);
        return x;
    }
}
