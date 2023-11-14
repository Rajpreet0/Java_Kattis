package Kattis_Pflicht;

import java.util.Scanner;

public class relatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            int result = countRelativelyPrimeNumbers(n);
            System.out.println(result);
        }

        scanner.close();
    }


    public static int countRelativelyPrimeNumbers(int n) {
        int phi = n;  // Initialize Euler's Totient function result as n

        // Find the prime factors of n
        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                // Removes multiples of p and adjust phi
                while (n % p == 0) {
                    n /= p;
                }
                phi -= phi / p;
            }
        }

        // If n is till bigger than 1 it is a prime factor
        if (n > 1) {
            phi -= phi / n;
        }

        return phi;
    }
}