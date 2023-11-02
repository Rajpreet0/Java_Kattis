import java.util.Scanner;

public class Jack_O_Lantern_Juxtaposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = input_num(scanner);
        int T = input_num(scanner);
        int M = input_num(scanner);

       System.out.print(N*T*M);

    }

    public static int input_num(Scanner scanner){
        int x;
        do{
            x = scanner.nextInt();
        } while (x < 1 || x > 1000);

        return x;
    }

}
