import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = input(scanner);
        String temp = String.valueOf(n);
        char[] out = temp.toCharArray();
        boolean answer = false;

        for (int i = 0; i < out.length; i++){
            if(out[0] == '5' && out[1] == '5' && out[2] == '5'){
                answer = true;
            }
        }


        if (answer){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }

    public static int input(Scanner scanner){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < 1000000 || x > 9999999);
        return x;
    }
}
