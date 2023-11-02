import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class GCVWR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int G = input(scanner, 5000, 25000);
        int T = input(scanner, 3000, 12000);
        int N = input(scanner, 1 , 100);

        System.out.println(checkWeight(scanner, G,T,N));
    }

    public static int input(Scanner scanner, int a, int b){
        int x;
        do{
            x = scanner.nextInt();
        }while (x < a || x > b);
        return x;
    }

    public static int checkWeight(Scanner scanner, int G, int T, int N){
        if(T <= G-2000){
            int sum_w = 0;
            for (int i = 0; i < N; i++){
                int w = input(scanner, 1, 500);
                sum_w = w + sum_w;
            }
            double max = (G-T)*0.9;
            if(sum_w <= (int)max) {
                return (int)max-sum_w;
            }
        }

        return 0;
    }
}
