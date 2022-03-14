package com.SecondResolve;

import java.io.*;
import java.util.Arrays;

public class BOJ2447_2 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        for(int i = 0;i<n;i++){
            Arrays.fill(arr[i], ' ');
        }
        star(n, 0, 0);
        for (int i = 0; i < n; i++) {
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    static void star(int n, int x, int y) {
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) continue;
                else {
                    star(size, x + (size * i), y + (size * j));
                }
            }
        }
    }
}
