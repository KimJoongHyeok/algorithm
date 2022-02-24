package com.CosPro;

public class Solution1_5_3 {
    static boolean inRange(int x, int y, int N) {
        return (0 <= x && x < N && 0 <= y && y < N);
    }

    public static void main(String[] args) {
        int N = 3;
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        int x = 0;
        int y = 0;
        int arr[][] = new int[N][N];
        int num = 1;

        while (inRange(x, y, N) && arr[x][y] == 0) {
            for (int dir = 0; dir < 4; dir++) {
                if (!inRange(x, y, N) || arr[x][y] != 0) break;
                while (true) {
                    arr[x][y] = num++;
                    int next_x = x + dx[dir]; // x y check_x check_y
                    int next_y = y + dy[dir]; // 0 0    0        1
                    if (!inRange(next_x, next_y, N) || arr[next_x][next_y] != 0) {
                        x += dx[(dir + 1) % 4]; //방향전환용
                        y += dy[(dir + 1) % 4];
                        break;
                    }
                    x = next_x;
                    y = next_y;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf(" %2d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
