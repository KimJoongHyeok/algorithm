package com.BruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        //arr배열에 입력값 넣기
        Character [][]arr = new Character[m][n];
        for(int i = 0;i<m;i++){
            String chess = sc.next();
            for(int j = 0;j<n;j++){
                arr[i][j] = chess.charAt(j);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer>list = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0;i<n-8;i++){
            for(int j = 0;j<m-8;j++){
                for(int k = 1;k<8;k++){
                    for(int l = 1;l<8;l++){
                        if(arr[k-1][l-1] == arr[k][l]){
                            count++;
                        }
                    }
                }
            }
        }
    }
}
