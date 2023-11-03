import java.util.Scanner;

// Easy 1.3 - Which is Greater ?

public class which_is_greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = input(scanner);
        int b = input(scanner);

        if (a > b){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }

    public static int input(Scanner scanner){
        int x;
        do{
            x = scanner.nextInt();
        }while (x < 0 || x > 1000000000);
        return  x;
    }
}
