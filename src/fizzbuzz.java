import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = input(scanner);
        int y = input(scanner);
        int n = input(scanner);

        for (int i = 1; i <= n; i++){
            if ( (i % x == 0) && (i % y == 0)){
                System.out.println("FizzBuzz");
            }else if (i % y == 0){
                System.out.println("Buzz");
            }else if(i % x == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }

    }

    public static int input(Scanner scanner){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < 1 || x > 100);
        return x;
    }
}




