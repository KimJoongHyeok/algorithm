package com.CosPro;

import java.util.*;

public class Solution4_8_1 {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static public void permutation(int[] card, int[] output, boolean[] visited, int depth, int n) {
        //output이 완료되었다면 list에 추가하기 위해
        if (depth == n) {
            int answer = 0;
            int num = 1; // output[i] 마다 숫자로 만들기 위해
            for (int i = 1; i < n; i++) {
                num *= 10;
            }
            for (int i = 0; i < n; i++) {
                answer += output[i] * num;
                num /= 10;
            }
            //중복확인
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == answer) {
                    return;
                }
            }
            list.add(answer);
            return;
        }

        //재귀함수
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = card[i];
                permutation(card, output, visited, depth + 1, n);
                visited[i] = false;
            }
        }
    }

    public int main(String[] args) {
        int []card = {1,1,2,3};
        int n = 1312;
        boolean[] visited = new boolean[card.length];
        int[] output = new int[n];
        permutation(card, output, visited, 0, 4);

        Collections.sort(list);
        int answer = -1;
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            if (list.get(i) == n) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}

