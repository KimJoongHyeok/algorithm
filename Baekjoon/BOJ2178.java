package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {
    private static int[][] graph;
    private static int[][] answer;
    private static boolean[][] visited;
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N + 1][M + 1];
        answer = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 1; j <= M; j++) {
                graph[i][j] = line.charAt(j - 1) - '0';
            }
        }
        bfs(0, 1);

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                System.out.printf(" %2d", graph[i][j]);
            }
            System.out.println();
        }
    }

    private static void bfs(int x, int y) {
        Queue<Location> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(new Location(x, y));
        int[] dx = {0, 1, -1, 0}; // 우 하 상 좌
        int[] dy = {1, 0, 0, -1};

        while (!q.isEmpty()) {
            Location loc = q.poll();
            visited[loc.x][loc.y] = true;

            for (int dir = 0; dir < 4; dir++) {
                int next_x = loc.x + dx[dir];
                int next_y = loc.y + dy[dir];
                if (inRange(next_x, next_y) && graph[next_x][next_y] != 0 && !visited[next_x][next_y]) {
                    graph[next_x][next_y] = graph[loc.x][loc.y] + 1;
                    visited[next_x][next_y] = true;
                    q.offer(new Location(next_x, next_y));
                }
            }
        }
    }

    //    private static void bfs(int x, int y) {
//        Queue<Location> q = new LinkedList<>();
//        int[] dx = {0, 1, -1, 0}; // 우 하 상 좌
//        int[] dy = {1, 0, 0, -1};
//        q.offer(new Location(x, y));
//
//        while (!q.isEmpty()) {
//            Location loc = q.poll();
//            int now_x = loc.x;
//            int now_y = loc.y;
//
//            for (int dir = 0; dir < 4; dir++) {
//                int next_x = now_x + dx[dir];
//                int next_y = now_y + dy[dir];
//                if (inRange(next_x, next_y) && graph[next_x][next_y] != 0 && answer[next_x][next_y] == 0) { //범위를 벗어나거나 이미 지나갓다면
//                    q.offer(new Location(next_x, next_y));
//                    answer[next_x][next_y] = answer[now_x][now_y] + 1;
//                }
//            }
//        }
//    }
//
    public static boolean inRange(int x, int y) {
        return (0 <= x && x <= N && 0 <= y && y <= M);
    }
}

class Location {
    int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
