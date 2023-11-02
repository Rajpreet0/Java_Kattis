import java.util.Scanner;

public class Leggja_saman {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,m;
        do{
            n = scanner.nextInt();
        }while(n < 2 || n > 1000 );
        do{
            m = scanner.nextInt();
        }while(m < 2 || m > 1000 );

        System.out.println(n+m);

    }

   /* public static int input(){
        Scanner scanner = new Scanner(System.in);
        int x;
        do{
            x = scanner.nextInt();
        }while(x < 2 || x > 1000);
        return x;
    }*/
}

