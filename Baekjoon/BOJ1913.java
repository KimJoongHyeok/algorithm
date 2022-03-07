package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1913 {
    private static boolean inRange(int x, int y, int N) {
        return (0 <= x && x < N && 0 <= y && y < N);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0;
        int y = 0;
        int num = N * N;

        while (inRange(x, y, N) && arr[x][y] == 0) {
            for (int dir = 0; dir < 4; dir++) {
                if (!inRange(x, y, N) || arr[x][y] != 0) break;
                while (true) {
                    arr[x][y] = num--;
                    int next_x = x + dx[dir];
                    int next_y = y + dy[dir];
                    if (!inRange(next_x, next_y, N) || arr[next_x][next_y] != 0) {
                        x += dx[(1 + dir) % 4];
                        y += dy[(1 + dir) % 4];
                        break;
                    }
                    x = next_x;
                    y = next_y;
                }
            }
        }

        int M_x = 0;
        int M_y = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[i][j]).append(" ");
                if (arr[i][j] == M) {
                    M_x = i + 1;
                    M_y = j + 1;
                }
            }
            sb.append("\n");
        }
        sb.append(M_x).append(" ").append(M_y);
        System.out.println(sb);
    }

}
