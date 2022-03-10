package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {
    static int n, m, day, all_count;
    static int[][] graph;
    static boolean[][] visited;
    static Queue<Tomato> q = new LinkedList<Tomato>();
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];
        all_count = n * m; // 총 농장의 개수
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 1) { //익은 토마토 확인
                    q.offer(new Tomato(i, j, 0));
                    all_count--;
                } else if (graph[i][j] == -1) all_count--;
            }
        }

//        int count = 0; //구분되어 있는지 확인
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (graph[i][j] != -1 && !visited[i][j]) {
//                    dfs(i, j);
//                    count++;
//                }
//            }
//        }
        StringBuilder sb = new StringBuilder();


        bfs();

        System.out.println(day);

    }

//    static void dfs(int x, int y) {
//        visited[x][y] = true;
//
//        for (int dir = 0; dir < 4; dir++) {
//            int next_x = x + dx[dir];
//            int next_y = y + dy[dir];
//            if (inRange(next_x, next_y) && graph[next_x][next_y] != -1 && !visited[next_x][next_y]) {
//                visited[next_x][next_y] = true;
//                dfs(next_x, next_y);
//            }
//        }
//    }

    static void bfs() {
        if (all_count == 0) {
            day = 0;
            return;
        }
        while (!q.isEmpty()) {
            Tomato t = q.poll();
            day = t.day;
            visited[t.x][t.y] = true;
            for (int dir = 0; dir < 4; dir++) {
                int next_x = t.x + dx[dir];
                int next_y = t.y + dy[dir];
                if (inRange(next_x, next_y) && graph[next_x][next_y] == 0 && !visited[next_x][next_y]) {
                    visited[next_x][next_y] = true;
                    graph[next_x][next_y] = 1;
                    q.offer(new Tomato(next_x, next_y, t.day + 1));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0) {
                    day = -1;
                    return;
                }
            }
        }
    }

    static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}

class Tomato {
    int x, y, day;

    public Tomato(int x, int y, int day) {
        this.x = x;
        this.y = y;
        this.day = day;
    }
}
