package Kattis_Pflicht;

import java.util.Scanner;

public class sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Test Cases Reading
        int cases = scanner.nextInt();
        // Array for Input Values
        long[] input = new long[cases];

        // Read all Inputs
        for (int i = 0; i < cases; i++) {
            input[i] = scanner.nextLong();
        }

        // Process each Case and find Sequence
        for (int i = 0; i < cases; i++) {
            long n = input[i];
            long nums = 2;
            boolean found = false;

            // Try to find a sequence
            while (true) {
                // Calculate the sum of the first nums  (Gauß)
                long sub = nums * (nums - 1) / 2;
                // Calculate the remaining value
                long temp = n - sub;

                // Break out of loop if there isn't a sequence
                if (temp <= 0) break;

                // if Temp is divisible by num a sequence is found
                if (temp % nums == 0) {
                    print(n, temp / nums, nums);
                    found = true;
                    break;
                }

                nums++;
            }

            // Print out Impossible if nothing is found
            if (!found) {
                System.out.println("IMPOSSIBLE");
            }
        }
    }

    // Method for printing out sequence
    public static void print(long n, long start, long nums) {
        System.out.print(n + " = ");
        for (int i = 0; i < nums; i++) {
            System.out.print(start + i);
            if (i != nums - 1) System.out.print(" + ");
        }
        System.out.println();
    }
}