import java.util.Scanner;

public class triangle_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = input(scanner);
        int base = input(scanner);

        System.out.println((double)(height*base)/2);
    }

    public static int input(Scanner scanner){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < 1 || x > 1000);
        return x;
    }
}
