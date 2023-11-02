import java.util.Scanner;

public class Finding_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[]  c = word.toCharArray();

        int position = 0;
        for (int i = 0; i < c.length; i++){
            if(c[i] == 'a'){
                position = i;
                break;
            }
        }

        for (int i = position; i < (c.length); i++){
            System.out.print(c[i]);
        }
    }
}
