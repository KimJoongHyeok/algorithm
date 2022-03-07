package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178_3 {
    static int N, M;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }
        bfs(0, 0);
        System.out.println(graph[N-1][M-1]);

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.printf(" %2d", graph[i][j]);
//            }
//            System.out.println();
//        }
    }

    static void bfs(int x, int y) {
        Queue<Point2> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(new Point2(x, y));

        while (!q.isEmpty()) {
            Point2 p = q.poll();
            for (int dir = 0; dir < 4; dir++) {
                int next_x = p.x + dx[dir];
                int next_y = p.y + dy[dir];
                if (inRange(next_x, next_y) && graph[next_x][next_y] != 0 && !visited[next_x][next_y]) {
                    graph[next_x][next_y] = graph[p.x][p.y] + 1;
                    visited[next_x][next_y] = true;
                    q.offer(new Point2(next_x, next_y));
                }
            }
        }
    }

    static boolean inRange(int x, int y) {
        return (0 <= x && x < N && 0 <= y && y < M);
    }
}

class Point2 {
    int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
