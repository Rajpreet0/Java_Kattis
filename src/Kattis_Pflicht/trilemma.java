package Kattis_Pflicht;

import java.util.Scanner;

public class trilemma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int caseNum = 1; caseNum <= N; caseNum++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();

            String classification = classifyTriangle(x1, y1, x2, y2, x3, y3);

            System.out.println("Case #" + caseNum + ": " + classification);
        }

        scanner.close();
    }

    public static String classifyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double side1 = calculateDistance(x1, y1, x2, y2);
        double side2 = calculateDistance(x2, y2, x3, y3);
        double side3 = calculateDistance(x3, y3, x1, y1);

        if (!isTriangle(side1, side2, side3)) {
            return "not a triangle";
        }

        double[] angles = calculateAngles(side1, side2, side3);

        if (isRightTriangle(angles)) {
            return "right triangle";
        } else if (isObtuseTriangle(angles)) {
            return "obtuse triangle";
        } else {
            return "acute triangle";
        }
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static boolean isTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }

    public static double[] calculateAngles(double side1, double side2, double side3) {
        double[] angles = new double[3];
        angles[0] = Math.toDegrees(Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3)));
        angles[1] = Math.toDegrees(Math.acos((side3 * side3 + side1 * side1 - side2 * side2) / (2 * side3 * side1)));
        angles[2] = Math.toDegrees(Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2)));
        return angles;
    }

    public static boolean isRightTriangle(double[] angles) {
        for (double angle : angles) {
            if (Math.abs(angle - 90) < 1e-9) {
                return true;
            }
        }
        return false;
    }

    public static boolean isObtuseTriangle(double[] angles) {
        for (double angle : angles) {
            if (angle > 90) {
                return true;
            }
        }
        return false;
    }
}


