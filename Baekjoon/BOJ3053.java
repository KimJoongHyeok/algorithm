package com.Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());
        double answer1 = (double) (Math.PI * r * r);
        double answer2 = (double) (r * r * 2);
        System.out.println(answer1);
        System.out.println(answer2);
    }
}
