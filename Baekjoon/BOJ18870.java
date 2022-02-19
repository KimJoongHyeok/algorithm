package com.Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class BOJ18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; //정렬용
        int[] answer = new int[n]; //map이랑 비교할 배열용
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //배열 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = answer[i] = sc.nextInt();
        }

        //배열 오름차순 정렬
        Arrays.sort(arr);
        //-10 -9 2 4 4
        // 0 1 2 3 3
        int rank = 0;

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int key : answer) {
            sb.append(map.get(key)).append(" ");
        }
        System.out.println(sb);

    }
}
