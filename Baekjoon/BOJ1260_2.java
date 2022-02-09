package com.DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1260_2 {
    public static boolean[]visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<Integer>answer = new ArrayList<Integer>();

    public static void dfs(int x){
        visited[x] = true;
        answer.add(x);
        System.out.print(x + " ");
        for(int i = 0;i<graph.get(x).size();i++){
            int y = graph.get(x).get(i);
            if(!visited[y]) dfs(y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//정점의 개수
        int m = sc.nextInt();//간선의 개수
        int start = sc.nextInt();//시작정점 번호

        visited = new boolean[n+1];
        //그래프 초기화
        for(int i = 0;i<n+1;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(start);
        System.out.println("---------------------");
        for(int i:answer){
            System.out.print(i + " ");
        }
    }
}
