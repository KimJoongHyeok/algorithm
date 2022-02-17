package com.BruteForce;

import java.util.Comparator;
import java.util.Scanner;

public class BOJ7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr = new int[n][2];

        for(int i = 0;i<n;i++){
            int w = sc.nextInt();
            int h = sc.nextInt();

            arr[i][0] = w; // 몸무게
            arr[i][1] = h; // 키
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<n;i++){
            int rank  = 1;
            for(int j = 0;j<n;j++){
                if(i != j){
                    if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                        rank++;
                    }
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}
