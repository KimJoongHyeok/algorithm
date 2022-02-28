package com.Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15655 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringTokenizer s = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s.nextToken());
        }
        Arrays.sort(arr);

        boolean[] visited = new boolean[arr.length];
        comb(arr, visited, 0, M);
        System.out.println(sb);
    }

    private static void comb(int[] arr, boolean[] visited, int index, int r) {
        if (r == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i] == true) {
                    sb.append(arr[i]).append(" ");
                }
            }
            sb.append("\n");
            return;
        }
        if (index == arr.length) {
            return;
        } else {
            visited[index] = true;
            comb(arr, visited, index + 1, r - 1);

            visited[index] = false;
            comb(arr, visited, index + 1, r);
        }
    }
}
