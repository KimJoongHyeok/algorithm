package com.Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ15663 {
    private static StringBuilder sb = new StringBuilder();
    private static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int[] output = new int[M];
        boolean[] visited = new boolean[arr.length];
        permutation(arr, output, visited, 0, M);

        System.out.println(sb);
    }

    private static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int m) {
        if (depth == m) {
            StringBuilder check = new StringBuilder();
            for (int i = 0; i < output.length; i++) {
                check.append(output[i]).append(" ");
            }
            if(!map.containsKey(check.toString())){
                sb.append(check.toString()).append("\n");
                map.put(check.toString(),0);
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, m);
                visited[i] = false;
            }
        }
    }

}
