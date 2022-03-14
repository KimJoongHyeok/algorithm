package com.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2839 {
    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new Integer[5001];

        bfs();
        if (arr[n] == null) System.out.println(-1);
        else {
            System.out.println(arr[n]);
        }
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        arr[0] = 0;
        q.offer(0);

        while (!q.isEmpty()) {
            int n = q.poll();
            if (n + 3 <= 5000 && arr[n + 3] == null) {
                arr[n + 3] = arr[n] + 1;
                q.offer(n + 3);
            }
            if (n + 5 <= 5000 && arr[n + 5] == null) {
                arr[n + 5] = arr[n] + 1;
                q.offer(n + 5);
            }
        }
    }
}
