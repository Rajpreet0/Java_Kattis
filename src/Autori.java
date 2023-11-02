import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        char[] c = name.toCharArray(); // Converting String into Character Array
        char[] out = new char[100]; // Output Array with our new Nameing Convention

        int j = 1; // Prevent Collison afterwards
        out[0] = c[0]; // The First Letter is always in our Convention
        for (int i = 0; i < c.length; i++){
            if(c[i] == '-'){ // Detect if there is an hypen
                out[j] = c[i+1]; // If Hypen than take the next Character and put it in a Array
                j++;
            }
        }

        // Output the Array
        for (char outC : out){
            if (outC != 0){
                System.out.print(outC);
            }
        }
    }
}
