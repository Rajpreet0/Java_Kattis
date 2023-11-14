import java.util.Scanner;

// Easy 1.4 - Bijele (Croatian Open Competition in Informatics 2007/2008, contest #2)
public class Bijele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pieces = new int[6];
        for (int i = 0; i < 6; i++){
            pieces[i] = scanner.nextInt();
        }

        int[] requiredPieces = {1, 1, 2, 2, 2, 8};
        int[] out = new int[6];


        for (int i = 0; i < 6; i++) {
            out[i] = requiredPieces[i] - pieces[i];
        }



        for (int res : out){
            System.out.print(res + " ");
        }
    }


}
