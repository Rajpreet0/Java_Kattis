import java.util.Scanner;

public class Rating_Problems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judges = scanner.nextInt();
        int rated_judges = scanner.nextInt();

        int[] ratings = new int[rated_judges];

        for (int i = 0; i < rated_judges; i++){
            ratings[i] = scanner.nextInt();
        }

        double max = calc_max_min(judges, ratings, rated_judges, 3);
        double min = calc_max_min(judges, ratings, rated_judges, -3);

        System.out.print(min + " " + max);

    }

    public static double calc_max_min(int judges, int[] ratings, int rated_judges, int min_max){
        int remaining_judges = judges-rated_judges;
        int sum = min_max*remaining_judges;
        for (int i = 0; i < rated_judges; i++){
            sum += ratings[i];
        }

        return (double) sum/judges;
    }

}
