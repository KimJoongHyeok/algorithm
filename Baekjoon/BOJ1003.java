package com.DynamicProgramming;

import java.io.*;

public class BOJ1003 {
    static int n_count;
    static int one_count;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            n_count = 0;
            one_count = 0;
            fibonacci(n);
            sb.append(n_count).append(" ").append(one_count).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    static int fibonacci(int n) {
        if (n == 0) {
            n_count++;
            return 0;
        } else if (n == 1) {
            one_count++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
