import java.util.ArrayList;
import java.util.Scanner;

// Easy - 1.3 -> Odd Echo

public class odd_echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = input(scanner);

        ArrayList<String> out = new ArrayList<>();

        for (int i = 1; i <= N; i++){
            String word = scanner.next();
            if(i%2 == 1){
                out.add(word);
            }
        }

        for (String each : out){
            System.out.println(each);
        }

    }

    public static int input(Scanner scanner){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < 1 || x > 10);
        return x;
    }
}
