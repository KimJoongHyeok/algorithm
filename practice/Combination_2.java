package com.Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Combination_2 {
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
        int[] output = new int[M];
        combination(arr, output, 0, 0, M);
        System.out.println(sb);
    }

    private static void combination(int[] arr, int[] output, int index, int depth, int m) {
        if(depth == m){
            sb.append("index : ").append(index).append(" output : ");
            for(int i = 0;i < output.length;i++){
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        if(index == arr.length) {
            sb.append("-------index : ").append(index).append(" return : ");
            for(int i = 0;i < output.length;i++){
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        output[depth] = arr[index];
        combination(arr,output,index + 1,depth + 1,m);
        combination(arr,output,index + 1,depth,m);
    }
}
