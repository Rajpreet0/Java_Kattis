import java.util.Scanner;

public class cpr_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cpr = scanner.next();
        char[] cpr_arr = cpr.toCharArray();

        int[] arr = {4,3,2,7,6,5,4,3,2,1};
        int j = 0;
        int temp = 0;
        int sum_tenth = 0;
        int sum_ones = 0;

        for (int i = 0; i < cpr_arr.length; i++){
            if(cpr_arr[i] == '-'){
                continue;
            }else {
                temp = Character.getNumericValue(cpr_arr[i]) * arr[j];
                for (int k = 0; k < 2; k++){
                    if (k == 0){
                        sum_ones += temp%10;
                    }else {
                        sum_tenth += temp%10;
                    }
                    temp = temp / 10;
                }
                j++;
            }
        }

        int sum = (sum_tenth*10) + sum_ones;

        if ((sum%11) == 0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }

}

