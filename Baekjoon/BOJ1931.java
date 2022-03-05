package com.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Meet implements Comparable<Meet> {
    int start, end;

    public Meet(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meet m) {
        return start - m.start;
    }
}

public class BOJ1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Meet[] arr = new Meet[n];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[i] = new Meet(start, end);
        }

        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<Integer>();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; i < n; j++) {
               if( arr[i].end <= arr[j].start){
                   answer++;
                   break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].start + " " + arr[i].end);
        }
    }
}
