import java.util.Scanner;

public class Quadrant_Selection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;

        do{
            x = scanner.nextInt();
        }while (x < -1000 || x > 1000 || x == 0);
        do{
            y = scanner.nextInt();
        }while (y < -1000 || y > 1000 || y == 0);


        if( x > 0 && y > 0){
            System.out.println(1);
        }else if (x < 0 && y > 0) {
            System.out.println(2);
        }else if (x < 0 && y < 0) {
            System.out.println(3);
        }else {
            System.out.println(4);
        }

    }
}
