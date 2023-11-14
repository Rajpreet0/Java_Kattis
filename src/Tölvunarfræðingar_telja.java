import java.util.Scanner;

public class Tölvunarfræðingar_telja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        do{
            n = scanner.nextInt();
        }while(n < 1 || n > 1000000000);

        System.out.println(n-1);
    }
}
