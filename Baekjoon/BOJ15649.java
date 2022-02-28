package com.Permutation;

import java.util.Scanner;

public class BOJ15649 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        int[] output = new int[M];
        boolean[] visited = new boolean[N];
        permutation(arr, output, visited, 0, M);
    }

    public static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int M) {
        if (depth == M) {
            for (int i : output) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, M);
                visited[i] = false;
            }
        }
    }
}
