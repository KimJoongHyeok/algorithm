package com.Sort;

import java.util.*;

public class BOJ2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        //산술평균
        double avg = 0;
        avg = (double) sum / (double) (n);
        System.out.println(Math.round(avg));

        Arrays.sort(arr);
        //중앙값
        int middle = arr[arr.length / 2];
        System.out.println(middle);

        //최빈값
        // -2 1 2 3 8
        // 1 1 1 1 1
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxValue = 0;
        for (int value : map.values()) {
            if (maxValue < value) {
                maxValue = value;
            }
        }

        ArrayList<Integer>list = new ArrayList<Integer>();
        for(int key : map.keySet()){
            if(map.get(key) == maxValue){
                list.add(key);
            }
        }

        Collections.sort(list);
        int mostView = 0;
        if(list.size() == 1){
            mostView = list.get(0);
        }
        else{
            mostView = list.get(1);
        }
        System.out.println(mostView);

        //최댓값 - 최솟값
        int range = arr[n - 1] - arr[0];
        System.out.println(range);

    }
}
