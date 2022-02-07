package com.company;


import java.util.Arrays;
import java.util.Scanner;

class Pointer implements Comparable<Pointer>{
    int x,y;

    public Pointer(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pointer o) {
        //y좌표가 같지 않다면
        if(this.y != o.y){
            return this.y - o.y;
        }
        //y좌표가 같다면 x좌표가 증가하는 순서로 정렬
        else{
            return this.x - o.x;
        }
    }
}

public class BOJ11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Pointer[] p = new Pointer[n];
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            p[i] = new Pointer(x,y);
        }

        Arrays.sort(p);

        for(int i = 0;i<p.length;i++){
            System.out.println(p[i].x + " " + p[i].y);
        }
    }
}
