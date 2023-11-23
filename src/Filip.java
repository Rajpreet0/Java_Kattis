import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two three-digit numbers
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // Reverse the numbers and find the larger one
        int reversedNumber1 = reverseNumber(number1);
        int reversedNumber2 = reverseNumber(number2);

        int result = Math.max(reversedNumber1, reversedNumber2);

        // Print the result
        System.out.println(result);

        scanner.close();
    }

    // Function to reverse a three-digit number
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
