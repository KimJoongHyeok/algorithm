package com.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1260 {
    public static int[][]graph;
    public static boolean[]visited;
    public static int n;
    public static int m;
    public static int start;

    public static void dfs(int i){
        visited[i] = true;
        System.out.print(i + " ");

        for(int j = 1;j<=n;j++){
            if(graph[i][j] == 1 && visited[j] == false){
                dfs(j);
            }
        }
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start); //시작점도 Queue에 넣어야 함
        visited[start] = true;
        System.out.print(start + " ");

        //Queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int j = 1; j <= n; j++) {
                if (graph[temp][j] == 1 && visited[j] ==false){
                    queue.offer(j);
                    visited[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//정점의 개수
        m = sc.nextInt();//간선의 개수
        start = sc.nextInt();//시작정점 번호

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        //연결된 정점 초기화
        for(int i = 0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            graph[x][y] = graph[y][x] = 1;
        }

        dfs(start);

        visited = new boolean[n+1];
        System.out.println();
        bfs();
    }
}
