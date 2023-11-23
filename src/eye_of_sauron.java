import java.util.Scanner;

public class eye_of_sauron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drawing = scanner.next();
        char[] drawing_arr = drawing.toCharArray();

        int counter_right = 0;
        int counter_left = 0;

        int i = 0;
        while(i  < drawing_arr.length && drawing_arr[i] != '('){
            counter_right++;
            i++;
        }

        i+=2;
        while (i < drawing_arr.length){
            counter_left++;
            i++;
        }


        if (counter_left == counter_right){
            System.out.println("correct");
        }else {
            System.out.println("fix");
        }

    }
}
