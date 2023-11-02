import java.util.Scanner;

public class metronome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            n = scanner.nextInt();
        }while (n < 1 || n > 100000);


        System.out.println(((double) n/4));
    }
}
