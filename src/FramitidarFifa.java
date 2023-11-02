import java.util.Scanner;
public class FramitidarFifa {
     public static void main(String[] args) {
         /**
          *     Starting in 2022
          *
          *     First Line are Imporvements (n)
          *     Second Line are Number of Improvements every year (k)
          *
          *     INPUT: n=5 and k=5  -> n/k = 1 -> 1+2022 = 2023
          *     INPUT: n=21 and k=3 -> n/k = 7 -> 7+2022 = 2029
          *
          */

         Scanner scanner = new Scanner(System.in);

         int n,k;
         do {
            n = scanner.nextInt();
         }while (n < 0 || n > 2000000000);
         do {
             k = scanner.nextInt();
         }while (k < 1 || k > 1000);

         System.out.println((n/k)+2022);
     }
}
