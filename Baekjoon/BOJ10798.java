package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]arr = new String[5];

        for(int i = 0;i<5;i++){
            arr[i] = br.readLine();
        }

        String[][] s = new String[5][15];

        for(int i = 0;i<5;i++){
            for(int j = 0;j<15;j++){
                s[i][j] = String.valueOf(arr[i].charAt(j));
            }
        }
    }
}
