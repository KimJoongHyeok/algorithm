package com.Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15657 {
    private static StringBuilder sb = new StringBuilder();

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
        int[] output = new int[M];
        comb(arr, output, 0, 0, M);
        System.out.println(sb);
    }

    private static void comb(int[] arr, int[] output, int index, int cnt, int m) {
        if (cnt == m) {
            for (int i = 0; i < output.length; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (index == 0) {
                output[index] = arr[i];
                comb(arr, output, i, cnt + 1, m);
            }
            if (index != 0 && output[index] <= arr[i]) {
                output[index] = arr[i];
                comb(arr, output, i, cnt + 1, m);
            }else{
                return;
            }
        }
    }
}
