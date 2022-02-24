package com.CosPro;

public class Solution2_3 {
    static boolean inRange(int x, int y) {
        return (0 <= x && x < 8 && 0 <= y && y < 8);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int all = 64;
        int[] num = {7, 9, 11, 13};
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[][] arr = new int[8][8];
        int x = 0;
        int y = 0;
        int N = 0;

        while (inRange(x, y) && arr[x][y] == 0) {
            for (int dir = 0; dir < 4; dir++) {
                if (!inRange(x, y) || arr[x][y] != 0) break;
                while (true) {
                    arr[x][y] = num[N];
                    int check_x = x + dx[dir];
                    int check_y = y + dy[dir];
                    if (!inRange(check_x, check_y) || arr[check_x][check_y] != 0) {
                        x += dx[(dir + 1) % 4];
                        y += dy[(dir + 1) % 4];
                        break;
                    }
                    x = check_x;
                    y = check_y;
                }
            }
            N++;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf(" %2d", arr[i][j]);
            }
            System.out.println();
        }

        String[] bishops = {"D5","E8","G2"};
        int sum = 0;

        for (int i = 0; i < bishops.length; i++) {
            x = bishops[i].charAt(0) - 'A';
            y = bishops[i].charAt(1) - '0' - 1;

            sum += arr[x][y];
        }
        System.out.println("sum = " + sum);
        int len = bishops.length;
        int forMinus = 0;
        if(len >= 2){
            for (int i = 1; i <= len; i++) {
                forMinus += 2 * i;
            }
        }

        System.out.println("forMinus = " + forMinus);
        int answer = 64 - sum + forMinus - len;
        System.out.println("answer = " + answer);
    }
}
