package com.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2606 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        dfs(1);
        System.out.println(count);
    }

    static void dfs(int start) {
        visited[start] = true;

        for (int y : graph.get(start)) {
            if(!visited[y]){
                count++;
                dfs(y);
            }
        }
    }
}
