import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String msg = scanner.next();
        char[] c = msg.toCharArray();

        // Defining the new Output Array
        char[] out = new char[((c.length*2)-2)];

        out[0] = 'h'; // The first Character will always be 'h'
        for (int i = 0; i < out.length; i++){
            if(i == out.length-1){
                out[i] = 'y';  // The las Character will always be 'y'
            }else if (i != 0){
                out[i] = 'e';  // Everything in between are 'e'
            }
        }

        // OUTPUT
        for (char out_c : out){
            System.out.print(out_c);
        }

    }
}
