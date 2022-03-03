package com.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String end = "e-n-d";
        int start_index = 0;

        String max = "";
        int max_length = -1;
        while (true) {
            String s = br.readLine().toLowerCase();
            if (s.contains(end)) break;
            String[] arr = s.split("[^a-z-]");

            for (int i = 1; i < arr.length; i++) {
                if(max_length < arr[i].length()){
                    max = arr[i];
                    max_length = arr[i].length();
                }
            }
        }
        System.out.println(max);
    }
}
