package Kattis_Pflicht;

import java.util.ArrayList;
import java.util.Scanner;

public class hitting_the_targets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        ArrayList<Target> targets = new ArrayList<>();

        // Read target descriptions
        for (int i = 0; i < m; i++) {
            String type = scanner.next();
            if (type.equals("rectangle")) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                targets.add(new RectangleTarget(x1, y1, x2, y2));
            } else if (type.equals("circle")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int r = scanner.nextInt();
                targets.add(new CircleTarget(x, y, r));
            }
        }

        int n = scanner.nextInt();
        int[] shotHits = new int[n];

        // Read shot coordinates and calculate hits
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (Target target : targets) {
                if (target.isHit(x, y)) {
                    shotHits[i]++;
                }
            }
        }

        // Print the number of hits for each shot
        for (int hits : shotHits) {
            System.out.println(hits);
        }
    }
}

interface Target {
    boolean isHit(int x, int y);
}

class RectangleTarget implements Target {
    private int x1, y1, x2, y2;

    public RectangleTarget(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public boolean isHit(int x, int y) {
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }
}

class CircleTarget implements Target {
    private int x, y, r;

    public CircleTarget(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public boolean isHit(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;

        return dx * dx + dy * dy <= r * r;
    }
}