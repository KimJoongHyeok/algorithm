package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ2468 {
    static int n;
    static int[][] graph;
    static boolean[][] visited;
    static HashSet<Integer> set = new HashSet<>(); //높이 중복제거용 set
    static ArrayList<Integer> list = new ArrayList<>(); //높이들 넣어줄 list
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //행 개수
        graph = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int height = Integer.parseInt(st.nextToken());
                graph[i][j] = height;
                if (!set.contains(height)) {
                    set.add(height);
                    list.add(height);
                }
            }
        }
        list.add(0);

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int height = list.get(i);
            int count = 0;
            visited = new boolean[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (graph[j][k] > height && !visited[j][k]) {
                        dfs(height, j, k);
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }

    static void dfs(int heigth, int x, int y) {
        visited[x][y] = true;

        for (int dir = 0; dir < 4; dir++) {
            int next_x = x + dx[dir];
            int next_y = y + dy[dir];
            if (inRange(next_x, next_y) && !visited[next_x][next_y] && graph[next_x][next_y] > heigth) {
                dfs(heigth, next_x, next_y);
            }
        }
    }

    static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}
