import java.util.Scanner;

public class sort_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = input(scanner);
        int b = input(scanner);

        if (a > b){
            System.out.println(b + " " + a);
        }else {
            System.out.println(a + " " + b);
        }
    }

    public static int input(Scanner scanner){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < 0 || x > 1000000);
        return x;
    }
}
