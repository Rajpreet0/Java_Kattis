import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String base = scanner.next();
        int anzahl = scanner.nextInt();

        if ((base.equals("OCT") && anzahl == 31) || (base.equals("DEC")) && anzahl == 25){
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }

    }
}
