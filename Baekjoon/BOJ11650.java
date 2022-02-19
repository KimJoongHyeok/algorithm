package com.Sort;

import java.util.Arrays;
import java.util.Scanner;
class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p){
        if(this.x != p.x){
            return this.x - p.x;
        }else{
            return this.y - p.y;
        }
    }
}

public class BOJ11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point []arr = new Point[n];

        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Point(x,y);
        }

        Arrays.sort(arr);

        for(Point p : arr){
            System.out.println(p.x + " " + p.y);
        }
    }
}
