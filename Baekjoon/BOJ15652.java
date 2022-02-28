package com.Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15652 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        br.close();
        int[] output = new int[M];

        permutation(N, output, 0, M, 1);
        System.out.println(sb);
    }

    private static void permutation(int N, int[] output, int depth, int M, int start) {
        if (depth == M) {
            for (int i = 0; i < output.length; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (depth == 0) {
                output[depth] = i;
                permutation(N, output, depth + 1, M, start + 1);
            }
            if (depth != 0 && output[depth - 1] <= i) {
                output[depth] = i;
                permutation(N, output, depth + 1, M, start + 1);
            }
        }
    }
}
