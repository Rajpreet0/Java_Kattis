import java.util.Scanner;

public class digitswap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = input(scanner);
        System.out.println(swap(n));

    }

    public static int swap(int n){
        String temp = String.valueOf(n);
        temp = new StringBuilder(temp).reverse().toString();
        return Integer.valueOf(temp);
    }

    public static int input(Scanner scanner){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < 11 || x > 99);
        return x;
    }
}
