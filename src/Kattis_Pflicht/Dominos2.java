package Kattis_Pflicht;
import java.util.ArrayList;
import java.util.Scanner;

//DOSEN'T WORK OR I DON'T KNOW IF THIS WORKS
public class Dominos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        for (int testCase = 0; testCase < t; testCase++) {
            // Read the input for each test case
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int l = scanner.nextInt();

            // Create an array to represent the dominoes and initialize them as not fallen
            boolean[] fallen = new boolean[n + 1];

            // Create an adjacency list to represent the relationships between dominoes
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            // Read the relationships between dominoes
            for (int i = 0; i < m; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                graph.get(x).add(y);
            }

            // Read the dominoes knocked over by hand
            for (int i = 0; i < l; i++) {
                int z = scanner.nextInt();
                // Mark the domino as fallen
                fallen[z] = true;
            }

            // Process the dominoes that fall due to the initial topples
            for (int i = 1; i <= n; i++) {
                if (!fallen[i]) {
                    dfs(i, graph, fallen);
                }
            }

            // Count the total number of fallen dominoes for this test case
            int totalFallen = 0;
            for (boolean isFallen : fallen) {
                if (isFallen) {
                    totalFallen++;
                }
            }

            // Print the result for each test case
            System.out.println(totalFallen-1);
        }

        scanner.close();
    }

    // Depth-first search to mark all connected dominoes as fallen
    private static void dfs(int domino, ArrayList<ArrayList<Integer>> graph, boolean[] fallen) {
        fallen[domino] = true;
        for (int neighbor : graph.get(domino)) {
            if (!fallen[neighbor]) {
                dfs(neighbor, graph, fallen);
            }
        }
    }
}
