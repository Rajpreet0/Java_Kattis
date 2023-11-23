import java.util.Scanner;

public class the_plank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the length of the plank
        int n = scanner.nextInt();

        // Calculate and print the number of ways
        int result = countWays(n);
        System.out.println(result);

        scanner.close();
    }

    // Solved using this:

    /*

        dp(i) = dp(i-1) + dp(i-2) + dp(i-3)

        This is because you can glue a 1 m piece to a plank of length i - 1
        to form a plank length of i. The same has for plank with 2 and 3 m

     */

    static int countWays(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] += dp[i - 1];
            if (i >= 2) {
                dp[i] += dp[i - 2];
            }
            if (i >= 3) {
                dp[i] += dp[i - 3];
            }
        }

        return dp[n];
    }
}

