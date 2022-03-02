package com.Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        Arrays.sort(arr);
        boolean[] visited = new boolean[arr.length];
        comb(arr, visited, 0, 0, M); //일반조합

        int[] output = new int[M];
        //comb2(arr, output, 0, 0, M);
        System.out.println(sb);
    }

    //일반 조합
    private static void comb(int[] arr, boolean[] visited, int index, int cnt, int M) {
        if (cnt == M) {

        }
        for (int i = index; i < arr.length; i++) {
            visited[i] = true;
            comb(arr, visited, index + 1, cnt + 1, M - 1);

            visited[i] = false;
            comb(arr, visited, index + 1, cnt + 1, M);
        }
    }
    //중복조합
//    private static void comb2(int[] arr, int[] output, int index, int cnt, int M) {
//        if (cnt == M) {
//            for (int i = 0; i < output.length; i++) {
//                sb.append(output[i]).append(" ");
//            }
//            sb.append("\n");
//            return;
//        }
//        for (int i = index; i < arr.length; i++) {
//            output[cnt] = arr[i];
//            comb2(arr, output, index, cnt + 1, M);
//        }
//    }
}

