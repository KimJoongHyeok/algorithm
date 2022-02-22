package com.CosPro;

public class Solution1_6 {
    public static void main(String[] args) {
        String pos = "A7";
        int x = pos.charAt(0) - 'A';
        int y = pos.charAt(1) - '1';
        int answer = 0;
        System.out.println(x + " " + y);

        if (0 <= x - 1 && x - 1 < 8 && 0 <= y - 2 && y - 2 < 8) {
            System.out.println((x - 1) + " " + (y - 2));
            answer++;
        } else if (0 <= x - 2 && x - 2 < 8 && 0 <= y - 1 && y - 1 < 8) {
            System.out.println((x - 2) + " " + (y - 1));
            answer++;
        } else if (0 <= x - 2 && x - 2 < 8 && 0 <= y + 1 && y + 1 < 8) {
            System.out.println((x - 2) + " " + (y + 1));
            answer++;
        } else if (0 <= x - 1 && x - 1 < 8 && 0 <= y + 2 && y + 2 < 8) {
            System.out.println((x - 1) + " " + (y + 2));
            answer++;
        } else if (0 <= x + 1 && x + 1 < 8 && 0 <= y - 2 && y - 2 < 8) {
            System.out.println((x + 1) + " " + (y - 2));
            answer++;
        } else if (0 <= x + 2 && x + 2 < 8 && 0 <= y - 1 && y - 1 < 8) {
            System.out.println((x + 2) + " " + (y - 1));
            answer++;
        } else if (0 <= x + 2 && x + 2 < 8 && 0 <= y + 1 && y + 1 < 8) {
            System.out.println((x + 2) + " " + (y + 1));
            answer++;
        } else if (0 <= x + 1 && x + 1 < 8 && 0 <= y + 2 && y + 2 < 8) {
            System.out.println((x + 1) + " " + (y + 2));
            answer++;
        }

        System.out.println(answer);
    }
}
