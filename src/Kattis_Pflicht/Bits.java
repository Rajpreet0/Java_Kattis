package Kattis_Pflicht;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int testCaseCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Iterate through each test case
        for (int testCase = 0; testCase < testCaseCount; testCase++) {
            // Read the input string
            String inputString = scanner.nextLine();
            char characters[] = inputString.toCharArray();
            int digitArray[] = new int[characters.length];
            ArrayList<Integer> onesCountList = new ArrayList<>();

            // Convert characters to digits
            for (int index = 0; index < characters.length; index++) {
                digitArray[index] = Character.getNumericValue(characters[index]);
            }

            String partialBinary = "0";
            String binaryRepresentation = null;

            // Iterate through each character and calculate the maximum number of ones in binary representation
            for (int index = 0; index < characters.length; index++) {
                partialBinary = partialBinary + characters[index];
                int onesCount = 0;
                int decimalValue = Integer.valueOf(partialBinary);
                binaryRepresentation = Integer.toBinaryString(decimalValue);
                char binaryDigits[] = binaryRepresentation.toCharArray();

                // Count the number of ones in the binary representation
                for (int binaryIndex = 0; binaryIndex < binaryDigits.length; binaryIndex++) {
                    if (binaryDigits[binaryIndex] == '1') {
                        onesCount += 1;
                    }
                }

                onesCountList.add(onesCount);
            }

            // Sort the list in ascending order and print the maximum value
            Collections.sort(onesCountList);
            System.out.println(onesCountList.get(onesCountList.size() - 1));
        }
    }
}
