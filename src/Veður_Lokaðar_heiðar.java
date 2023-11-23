import java.util.ArrayList;
import java.util.Scanner;

// Easy 1.4 - Veður - Lokaðar heiðar  (Forritunarkeppni Framhaldsskólanna 2022)
public class Veður_Lokaðar_heiðar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = input(scanner, 0, 200);
        int n = input(scanner, 1, 100);

        ArrayList<String> roadNameList = new ArrayList<>();
        int[] out = new int[n];

        for (int i=0; i<n; i++){
            String roadName = scanner.next();
            int k = input(scanner, 0, 200);
            roadNameList.add(roadName);
            if(k >= v){
                out[i] = 1;
            }else {
                out[i] = 0;
            }
        }

        int i = 0;
        for (String res : roadNameList){
            if (out[i] == 1){
                System.out.println(res + " opin");
            }else {
                System.out.println(res + " lokud");
            }
            i++;
        }


    }

    public static int input(Scanner scanner, int a, int b){
        int x;
        do {
            x = scanner.nextInt();
        }while (x < a || x > b);
        return x;
    }
}

