package Kattis_Pflicht;

import java.util.Scanner;

public class Good_Morning {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int k = scanner.nextInt();
            int result = findClosestNumber(k);
            System.out.println(result);
        }
    }

    // Find closet number on keyboard
    private static int findClosestNumber(int k) {
        // The idea is to round down the last digit to the nearest multiple of 10
        // For example, if k is 83, round down 3 to 0, so the result is 80
        int lastDigit = k % 10;
        return k - lastDigit;
    }
}
