package com.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1259 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;
            isPalindrome(s);
        }
        System.out.println(sb);
    }

    public static void isPalindrome(String s) {
        String[] arr = s.split("");

        int left = 0;
        int right = arr.length - 1;
        String answer = "yes";
        for (int i = 0; i < arr.length / 2; i++) {
            if (!arr[left].equals(arr[right])) {
                answer = "no";
                break;
            }
            left++;
            right--;
        }
        sb.append(answer).append("\n");
    }
}
