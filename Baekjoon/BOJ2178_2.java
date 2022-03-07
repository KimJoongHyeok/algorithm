package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178_2 {
    static int N, M;
    static int[][] graph;
    static int[][] answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        answer = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = s.charAt(j) - '0';
                answer[i][j] = -1;
            }
        }

        bfs(0, 0);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf(" %2d",answer[i][j]);
            }
            System.out.println();
        }
        System.out.println(answer[N-1][M-1]);
    }

    static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        answer[x][y] = 1;

        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int dir = 0; dir < 4; dir++) {
                int next_x = p.x + dx[dir];
                int next_y = p.y + dy[dir];
                if (inRange(next_x, next_y) && graph[next_x][next_y] == 1 && answer[next_x][next_y] == -1) {
                    answer[next_x][next_y] = answer[p.x][p.y] + 1;
                    q.offer(new Point(next_x, next_y));
                }
            }
        }
    }

    static boolean inRange(int x, int y) {
        return (0 <= x && x < N && 0 <= y && y < M);
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
