import java.util.Scanner;

public class jumbo_javelin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Formular for this Problem: \sum_{i}^{l_i} l_i - (N-1)

        int N = input(scanner, 2, 100);

        int sum = 0;
        for (int i = 0; i < N; i++){
            int l = input(scanner, 1, 50);
            sum = l + sum;
        }

        System.out.println((sum-(N-1)));

    }

    public static int input(Scanner scanner, int a, int b){
        int x;
        do{
            x = scanner.nextInt();
        }while (x < a || x > b);

        return x;
    }
}
