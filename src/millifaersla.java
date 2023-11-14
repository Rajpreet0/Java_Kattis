import java.util.Scanner;

public class millifaersla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = input(scanner);
        int b = input(scanner);
        int c = input(scanner);

        if (a < b && a < c){
            System.out.println("Monnei");
        }else if (b < a && b < c){
            System.out.println("Fjee");
        }else {
            System.out.println("Dolladollabilljoll");
        }

    }

    public static int input(Scanner scanner){
        int x = 0;
        do {
            x = scanner.nextInt();
        }while (x < 1 || x > 1000000000);
        return x;
    }
}
