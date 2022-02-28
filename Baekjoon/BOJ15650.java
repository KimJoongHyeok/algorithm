package com.Permutation;

import java.util.Scanner;

public class BOJ15650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        boolean[] visited = new boolean[arr.length];
        comb(arr, visited, 0, r);
    }

    private static void comb(int[] arr, boolean[] visited, int index, int r) {
        if (r == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i] == true) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
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
