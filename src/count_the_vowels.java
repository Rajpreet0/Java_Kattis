import java.util.Scanner;

public class count_the_vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        char[] sentence_arr = sentence.toCharArray();

        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int vowels_count = 0;
        for (int i = 0 ; i < sentence_arr.length; i++){
            char temp = sentence_arr[i];
            for (int j = 0; j < vowels.length; j++){
                if (temp == vowels[j]){
                    vowels_count++;
                }
            }
        }

        System.out.println(vowels_count);
    }
}
