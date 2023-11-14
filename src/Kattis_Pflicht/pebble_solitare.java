package Kattis_Pflicht;

import java.util.HashMap;
import java.util.Scanner;

public class pebble_solitare {
    public static HashMap<String, Integer> map;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        for (int i = 0; i< cases; i++){
            map = new HashMap<>();
            StringBuilder board = new StringBuilder(scanner.next());
            int min = minPebble(board);
            System.out.println(min);
        }

    }

    public static int minPebble(StringBuilder board){
        if(map.containsKey(board.toString())){
            return map.get(board.toString());
        }
        int min = 0;
        for (int i=0; i < board.length(); i++){
            if (board.charAt(i) == 'o'){
                min++;
            }
        }
        for (int i = 0; i < board.length()-2; i++){
            if (board.charAt(i) == 'o' && board.charAt(i+1) == 'o' && board.charAt(i+2) == '-'){
                board.setCharAt(i, '-');
                board.setCharAt(i+1, '-');
                board.setCharAt(i+2, 'o');
                int returnVal = minPebble(board);
                if (returnVal < min){
                    min = returnVal;
                }
                board.setCharAt(i, 'o');
                board.setCharAt(i+1, 'o');
                board.setCharAt(i+2, '-');
            }
        }
        for (int i =  board.length()-1; i >= 2; i--){
            if (board.charAt(i) == 'o' && board.charAt(i-1) == 'o' && board.charAt(i-2) == '-'){
                board.setCharAt(i, '-');
                board.setCharAt(i-1, '-');
                board.setCharAt(i-2, 'o');
                int returnVal = minPebble(board);
                if (returnVal < min){
                    min = returnVal;
                }
                board.setCharAt(i, 'o');
                board.setCharAt(i-1, 'o');
                board.setCharAt(i-2, '-');
            }
        }
        map.put(board.toString(), min);
        return min;
    }
}
