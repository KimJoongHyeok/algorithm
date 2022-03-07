package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7562 {
    static int[][] arr;
    static boolean[][] visited;
    static int length,target_x, target_y;
    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            length = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            target_x = Integer.parseInt(st.nextToken());
            target_y = Integer.parseInt(st.nextToken());

            arr = new int[length][length];
            visited = new boolean[length][length];
            bfs(x, y);
            System.out.println(arr[target_x][target_y]);
        }
    }

    static void bfs(int x, int y) {
        Queue<Chess> q = new LinkedList<>();
        arr[x][y] = 0;
        visited[x][y] = true;
        q.offer(new Chess(x, y));

        while (!q.isEmpty()) {
            Chess c = q.poll();
            for (int dir = 0; dir < 8; dir++) {
                int next_x = c.x + dx[dir];
                int next_y = c.y + dy[dir];
                if(inRange(next_x,next_y) && !visited[next_x][next_y]){
                    visited[next_x][next_y] = true;
                    arr[next_x][next_y] = arr[c.x][c.y] + 1;
                    q.offer(new Chess(next_x,next_y));
                }
            }
        }
    }

    static boolean inRange(int x,int y){
        return(0 <= x && x < length && 0 <= y && y < length);
    }
}

class Chess {
    int x, y;

    public Chess(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
