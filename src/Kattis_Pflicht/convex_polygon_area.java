package Kattis_Pflicht;
import java.util.Scanner;

public class convex_polygon_area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int[] x = new int[m];
            int[] y = new int[m];


            for (int j = 0; j < m; j++) {
                x[j] = scanner.nextInt();
                y[j] = scanner.nextInt();
            }

            double area = calculateArea(x, y);


            System.out.println(area);
        }

    }

    // Shoelace formula to calculate the area of a convex polygon
    private static double calculateArea(int[] x, int[] y) {
        int n = x.length;
        double area = 0.0;

        for (int i = 0; i < n - 1; i++) {
            area += (x[i] * y[i + 1]) - (x[i + 1] * y[i]);
        }

        area += (x[n - 1] * y[0]) - (x[0] * y[n - 1]);


        area = Math.abs(area) / 2.0;

        return area;
    }
}