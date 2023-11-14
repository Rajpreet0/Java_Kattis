import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input_mic = scanner.next();
        char[]  c_arr = input_mic.toCharArray();

        boolean hissing_mic = false;

        for (int i = 0;  i < c_arr.length-1; i++){
            if(c_arr[i] == 's' && c_arr[i+1] == 's'){
                hissing_mic = true;
                break;
            }
        }

        if (hissing_mic){
            System.out.println("hiss");
        }else {
            System.out.println("no hiss");
        }
    }
}








