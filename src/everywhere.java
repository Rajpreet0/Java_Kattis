import java.util.HashSet;
import java.util.Scanner;

public class everywhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++){
            int n = scanner.nextInt();

            HashSet<String> cities = new HashSet<>();
            for (int j = 0; j < n; j++){
                String city = scanner.next();
                cities.add(city);
            }

            System.out.println(cities.size());
        }

        scanner.close();
    }
}






