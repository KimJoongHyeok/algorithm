package com.BruteForce;

import java.util.Scanner;

public class BOJ1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 0;
        while(true){
            if(String.valueOf(i).contains("666")){
                count++;
                //System.out.println("count : " + count);
                if(count == n){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}
