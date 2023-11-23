import java.util.Scanner;

public class Detailed_Differences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            String line1 = scanner.next();
            String line2 = scanner.next();

            char[] arrl1 = line1.toCharArray();
            char[] arrl2 = line2.toCharArray();

            char[] res = new char[arrl1.length];
            for (int j = 0; j < arrl1.length; j++){
                if (arrl1[j] == arrl2[j]){
                    res[j] = '.';
                }else {
                    res[j] = '*';
                }
            }

            System.out.println(line1);
            System.out.println(line2);
            for (char r : res){
                System.out.print(r);
            }
            System.out.println("\n");
        }
    }
}
