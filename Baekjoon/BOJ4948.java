package com.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4948 {
    static boolean[] prime = new boolean[123457 * 2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        getPrime();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!prime[i]) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    static void getPrime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
