package com.Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ15664 {
    private static StringBuilder sb = new StringBuilder();
    private static HashSet<String> set = new HashSet<String>();

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
        hcombination(arr, output, 0, 0, M);
        System.out.println(sb);
    }

    private static void hcombination(int[] arr, int[] output, int index, int depth, int M) {
        if (depth == M) {
            StringBuilder check = new StringBuilder();
            for (int i = 0; i < output.length; i++) {
                check.append(output[i]).append(" ");
            }
            if(set.contains(check.toString())) return;
            set.add(check.toString());
            sb.append(check.toString()).append("\n");
            return;
        }
        if (index == arr.length) return;
        output[depth] = arr[index];
        hcombination(arr, output, index + 1, depth + 1, M);
        hcombination(arr, output, index + 1, depth, M);
    }
}
