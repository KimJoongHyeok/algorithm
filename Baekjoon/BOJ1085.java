package com.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int x_one = x - 0;
        int x_two = w - x;
        int y_one = y - 0;
        int y_two = h - y;
        int min = Math.min(Math.min(x_one,x_two),Math.min(y_one,y_two));
        System.out.println(min);

    }
}
