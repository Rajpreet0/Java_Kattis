import java.util.Scanner;

// Easy - 1.3 - Adding Trouble

public class adding_trouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = input(scanner);
        int B = input(scanner);
        int C = input(scanner);

        if(A+B == C){
            System.out.println("correct!");
        }else {
            System.out.println("wrong!");
        }

    }


    public static  int input(Scanner scanner){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < -1000000000 || x > 1000000000);
        return x;
    }
}
