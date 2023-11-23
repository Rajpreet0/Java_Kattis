import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class dice_cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of faces for two dice
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Calculate the most likely outcomes
        List<Integer> outcomes = calculateMostLikelyOutcomes(N, M);

        // Output the results
        for (int outcome : outcomes) {
            System.out.println(outcome);
        }

        scanner.close();
    }

    private static List<Integer> calculateMostLikelyOutcomes(int N, int M) {
        List<Integer> outcomes = new ArrayList<>();

        // The minimum and maximum possible sums
        int minSum = 2;
        int maxSum = N + M;

        // Array to store the frequency of each possible sum
        int[] frequency = new int[maxSum - minSum + 1];

        // Calculate the frequency of each sum
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                frequency[i + j - minSum]++;
            }
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int f : frequency) {
            maxFrequency = Math.max(maxFrequency, f);
        }

        // Add outcomes with the maximum frequency to the list
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFrequency) {
                outcomes.add(i + minSum);
            }
        }

        // Sort the outcomes in ascending order
        Collections.sort(outcomes);

        return outcomes;
    }
}
