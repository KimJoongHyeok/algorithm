package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1697 {
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        visited = new int[100001];
        bfs(start, target);
        System.out.println(visited[target]);
    }

    static void bfs(int start, int target) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 0;

        while (!q.isEmpty()) {
            int x = q.poll();
            if (x == target) break;

            if (0 <= x - 1 && visited[x - 1] == 0) {
                visited[x - 1] = visited[x] + 1;
                q.offer(x - 1);
            }
            if (x + 1 <= 100000 && visited[x + 1] == 0) {
                visited[x + 1] = visited[x] + 1;
                q.offer(x + 1);
            }
            if (2 * x <= 100000 && visited[2 * x] == 0) {
                visited[2 * x] = visited[x] + 1;
                q.offer(2 * x);
            }
        }
    }
}
