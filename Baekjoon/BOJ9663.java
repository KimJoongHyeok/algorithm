package com.BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9663_3 {
    static int n, ans;
    static int[] queen;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        queen = new int[n];
        backTracking(0);
        System.out.println(ans);
    }

    static void backTracking(int row) {
        if (row == n) {
            ans++;
            return;
        }
        for (int i = 0; i < n; i++) {
            queen[row] = i;
            if (isOk(row)) {
                backTracking(row + 1);
            }
        }
    }

    static boolean isOk(int col) {
        for (int i = 0; i < col; i++) {
            if (queen[col] == queen[i]) return false;

            if (Math.abs(col - i) == Math.abs(queen[col] - queen[i])) return false;
        }
        return true;
    }
}
